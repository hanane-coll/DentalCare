package com.app.dentalcare.service;


import com.app.dentalcare.model.Decrire;
import com.app.dentalcare.repository.DecrireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DecrireService extends AbstractService<Decrire,Long>{

    @Autowired
    private DecrireRepository decrireRepository;

    @Override
    protected JpaRepository<Decrire, Long> getRepository(){
        return decrireRepository;
    }

}
