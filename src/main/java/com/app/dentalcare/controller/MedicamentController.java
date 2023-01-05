package com.app.dentalcare.controller;

import com.app.dentalcare.model.Medicament;
import com.app.dentalcare.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicamentController {
    @Autowired
    MedicamentService medicamentService;
    @Autowired
    MenuController menuController;

    @PreAuthorize("hasAuthority('MED')")
    @PostMapping("/addMedicament")
    public String add(@ModelAttribute Medicament medicament, Model model) {
        medicamentService.save(medicament);
        return "redirect:/Medicaments";
    }
    @PreAuthorize("hasAuthority('MED')")
    @GetMapping("/deleteMedicament/{id}")
    public String delete(@PathVariable Long id, Model model){
        medicamentService.delete(id);
        return "redirect:/Medicaments";
    }
}
