package com.app.dentalcare.service;


import com.app.dentalcare.model.Medicament;
import com.app.dentalcare.repository.MedicamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MedicamentService extends AbstractService<Medicament,Long>{

    @Autowired
    private MedicamentRepository medicamentRepository;

    @Override
    protected JpaRepository<Medicament, Long> getRepository(){
        return medicamentRepository;

    }
}
