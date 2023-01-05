package com.app.dentalcare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Decrire extends AbstractModel<Long> {
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "medicament_id")
    private Medicament medicament;
    private String Dosage;
    }