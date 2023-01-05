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
public class DossierMedicale extends AbstractModel<Long> {
    private Float Poid;
    private Float Temperature;
    private String Allergie;
    private String Observation;
    private String Antecidentmedc;
    private String LastUpdate;
}
