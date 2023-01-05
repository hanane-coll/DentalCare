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
public class Depense extends AbstractModel<Long> {
    private String nom;
    private String date;
    private Float montant;
    @OneToOne(
            cascade=CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "reglement_id")
    Reglement reglement;
}
