package com.branche.projetenseignant.Entite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long IdEnseignant;
    private String nomEnseignant;
    private String dateNaissance;
    private int nbrEnfant;
    @OneToMany
    private List<Specialite> specialite;
}
