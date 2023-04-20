package com.branche.projetenseignant.Dao;

import com.branche.projetenseignant.Entite.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantDao extends JpaRepository<Enseignant, Long> {
}
