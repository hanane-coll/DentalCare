package com.app.dentalcare.repository;

import com.app.dentalcare.model.Decrire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecrireRepository extends JpaRepository<Decrire, Long> {
}