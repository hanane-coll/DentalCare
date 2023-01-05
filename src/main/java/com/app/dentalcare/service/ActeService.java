package com.app.dentalcare.service;

import com.app.dentalcare.repository.ActeRepository;
import com.app.dentalcare.model.Acte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ActeService extends AbstractService<Acte,Long>{
    @Autowired
    private ActeRepository acteRepository;

    @Override
    protected JpaRepository<Acte, Long> getRepository(){
        return acteRepository;
    }

    public Acte getActeByNom(String noma){
        return acteRepository.findActeByNomA(noma);
    }

}
