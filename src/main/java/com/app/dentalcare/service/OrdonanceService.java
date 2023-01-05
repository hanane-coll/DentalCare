package com.app.dentalcare.service;


import com.app.dentalcare.dto.OrdonanceDTO;
import com.app.dentalcare.model.Decrire;
import com.app.dentalcare.repository.MedicamentRepository;
import com.app.dentalcare.repository.OrdonanceRepository;
import com.app.dentalcare.model.Ordonance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdonanceService extends AbstractService<Ordonance,Long>{

    @Autowired
    private OrdonanceRepository ordonanceRepository;
    @Autowired
    private MedicamentRepository medicamentRepository;
    @Override
    protected JpaRepository<Ordonance, Long> getRepository(){
        return ordonanceRepository;

    }
    public Ordonance dtoToModel(OrdonanceDTO ordonanceDTO) {
        Ordonance ordonance= ordonanceDTO.getOrdonance();
        ordonance.setNbrMedicament(Long.valueOf(ordonanceDTO.getMedicamentDTOList().size()));
        for (int i=0;i<ordonanceDTO.getMedicamentDTOList().size();i++) {
            Decrire decrire=new Decrire();
            decrire.setDosage(ordonanceDTO.getMedicamentDTOList().get(i).getDosage());
            decrire.setMedicament(medicamentRepository.getById(ordonanceDTO.getMedicamentDTOList().get(i).getMedicamentId()));
           ordonance.getDecrireList().add(decrire);
        }
        ordonanceRepository.save(ordonance);
        return ordonance;
    }
}
