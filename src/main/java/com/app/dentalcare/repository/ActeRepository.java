package com.app.dentalcare.repository;

import com.app.dentalcare.model.Acte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ActeRepository extends JpaRepository<Acte, Long> {
    @Query(value = "from Acte where NomA=?1")
     Acte findActeByNomA(String noma);
}