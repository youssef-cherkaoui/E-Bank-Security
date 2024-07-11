package com.Banke.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Compt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcompt;
    private String type_compt;
    private float sold;
    private LocalDate date_creation;
    private  boolean Fermee;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private User utilisateur;


//    @JsonIgnore
//    @OneToMany(mappedBy = "IdTransaction")
//    private Set<Transaction> transactions;

//    @OneToMany(mappedBy = "utilisateur")
//    @JsonIgnore
//    private List<Compt> compt_list ;



}
