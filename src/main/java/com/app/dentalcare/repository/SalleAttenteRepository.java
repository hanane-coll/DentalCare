package com.app.dentalcare.repository;

import com.app.dentalcare.model.SalleAttente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalleAttenteRepository extends JpaRepository<SalleAttente, Long> {
    @Query(value = "from SalleAttente where date=?1")
    List<SalleAttente> getByDate(String date);
}