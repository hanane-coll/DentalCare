package com.app.dentalcare.service;


import com.app.dentalcare.repository.DentRepository;
import com.app.dentalcare.model.Dent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DentService extends AbstractService<Dent,Long>{

    @Autowired
    private DentRepository dentRepository;

    @Override
    protected JpaRepository<Dent, Long> getRepository(){
        return dentRepository;

    }
}