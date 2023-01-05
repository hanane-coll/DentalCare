package com.app.dentalcare.service;


import com.app.dentalcare.repository.DossierMedicaleRepository;
import com.app.dentalcare.model.DossierMedicale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DossierMedicaleService extends AbstractService<DossierMedicale,Long>{

    @Autowired
    private DossierMedicaleRepository dossierMedicaleRepository;

    @Override
    protected JpaRepository<DossierMedicale,Long> getRepository(){
        return dossierMedicaleRepository;

    }
}
