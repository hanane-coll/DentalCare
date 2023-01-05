package com.app.dentalcare.repository;

import com.app.dentalcare.model.Ordonance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdonanceRepository extends JpaRepository<Ordonance, Long> {
}