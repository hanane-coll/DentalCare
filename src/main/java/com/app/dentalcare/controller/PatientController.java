package com.app.dentalcare.controller;

import com.app.dentalcare.service.PatientService;
import com.app.dentalcare.model.DossierMedicale;
import com.app.dentalcare.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PatientController {
@Autowired
PatientService patientService;
@Autowired
MenuController menuController;

    @PostMapping("/addPatient")
    public String add(@ModelAttribute Patient patientobject,Model model) {
        DossierMedicale dossierMedicale=new DossierMedicale();
        patientobject.setDossierMedicale(dossierMedicale);
        patientService.save(patientobject);
        return menuController.listPatient(model);
    }
    @PreAuthorize("hasAuthority('MED')")
    @GetMapping("/deletePatient/{id}")
    public String delete(@PathVariable Long id,Model model){
        patientService.delete(id);
        return menuController.listPatient(model);
    }
}
