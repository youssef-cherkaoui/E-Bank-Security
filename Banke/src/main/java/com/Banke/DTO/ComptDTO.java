package com.Banke.DTO;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ComptDTO {


    private int idcompt;
    private String type_compt;
    private float sold;
    private LocalDate date_creation;
    private  boolean Fermee;
}
