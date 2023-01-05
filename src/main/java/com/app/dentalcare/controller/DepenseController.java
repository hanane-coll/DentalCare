package com.app.dentalcare.controller;

import com.app.dentalcare.model.Depense;
import com.app.dentalcare.model.Reglement;
import com.app.dentalcare.service.DepenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DepenseController {
    @Autowired
    DepenseService depenseService;
    @PreAuthorize("hasAuthority('MED')")
    @PostMapping("Depenses/addDepense")
    public String add(@ModelAttribute Depense depense) {
        //avoid problem
        depense.setId(null);
        depense.setReglement(new Reglement());
        depenseService.save(depense);
        return "redirect:/Depenses";
    }
    @PreAuthorize("hasAuthority('MED')")
    @GetMapping("Depenses/deleteDepense/{id}")
    public String delete(@PathVariable Long id){
        depenseService.delete(id);
        return "redirect:/Depenses";
    }
    @PreAuthorize("hasAuthority('MED')")
    @GetMapping("/Depenses/validerDepense/{idd}")
    public String validerReglement(@PathVariable(name = "idd") Long idd){
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date=new Date();
        Depense depense=depenseService.get(idd);
        depense.getReglement().setFlux("sortant");
        depense.getReglement().setMontantPaye(depense.getMontant());
        depense.getReglement().setDatePayment(formatter.format(date));
        depenseService.save(depense);
        return "redirect:/Depenses";
    }
}
