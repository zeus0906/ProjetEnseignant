package com.branche.projetenseignant.Entite;

import javax.persistence.*;

@Entity
public class Specialite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long IdSpecialite;
    private String Designation;
    @ManyToOne
    private Enseignant enseignant;
}
