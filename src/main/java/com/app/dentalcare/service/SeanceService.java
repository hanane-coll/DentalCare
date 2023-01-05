package com.app.dentalcare.service;

import com.app.dentalcare.repository.SeanceRepository;
import com.app.dentalcare.model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class SeanceService extends AbstractService<Seance,Long>{

    @Autowired
    private SeanceRepository scianceRepository;

    @Override
    protected JpaRepository<Seance, Long> getRepository(){
        return scianceRepository;

    }
}
