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
public class Reglement extends AbstractModel<Long> {
    private Float MontantPaye;
    private String DatePayment;
    private String flux;
}
