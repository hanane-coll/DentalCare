package com.app.dentalcare.repository;

import com.app.dentalcare.model.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReglementRepository extends JpaRepository<Reglement, Long> {
    @Query(value = "from Reglement where flux='entrant'")
    List<Reglement> getAllRPaye();
    @Query(value = "from Reglement where flux='sortant'")
    List<Reglement> getAllDPaye();
}