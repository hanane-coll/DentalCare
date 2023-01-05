package com.app.dentalcare.service;


import com.app.dentalcare.model.Depense;
import com.app.dentalcare.repository.DepenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DepenseService extends AbstractService<Depense,Long>{

    @Autowired
    private DepenseRepository depenceRepository;

    @Override
    protected JpaRepository<Depense, Long> getRepository(){
        return depenceRepository;

    }
}
