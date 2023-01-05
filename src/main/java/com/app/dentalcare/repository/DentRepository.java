package com.app.dentalcare.repository;

import com.app.dentalcare.model.Dent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentRepository extends JpaRepository<Dent, Long> {
}