package com.app.dentalcare.dto;

import com.app.dentalcare.model.Ordonance;
import lombok.Data;

import java.util.List;


@Data
public class OrdonanceDTO {
    Ordonance ordonance;
   List<MedicamentDTO> medicamentDTOList;
}
