package com.Banke.DTO;

import lombok.Data;

import java.time.LocalDate;
@Data
public class CarteDTO {

    private int idCarte;
    private String numeroCarte;
    private LocalDate dateExpiration;
    private String typeCarte;
    private boolean active;
}
