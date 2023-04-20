package com.branche.projetenseignant.Controller;

import com.branche.projetenseignant.Dao.EnseignantDao;
import com.branche.projetenseignant.Entite.Enseignant;
import com.branche.projetenseignant.Exception.EnseignantNotFoundException;
import com.branche.projetenseignant.Exception.ImpossibleAjouterEnseignantException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EnseignantController {

    @Autowired
    EnseignantDao enseignantDao;

    @PostMapping(value = "/enseignants")
    public ResponseEntity<Enseignant> NouveauEnseignant(@RequestBody Enseignant enseignant){
        Enseignant newEnseignant = enseignantDao.save(enseignant);

        if(newEnseignant == null) throw new ImpossibleAjouterEnseignantException("Impossible d'ajouter un Enseignant");

        return new ResponseEntity<Enseignant>(enseignant, HttpStatus.CREATED);
    }

    @GetMapping(value = "/enseignant/{id}")
    public Optional<Enseignant> recupererUneCommande(@PathVariable Long id) throws EnseignantNotFoundException {

        Optional<Enseignant> enseignant = enseignantDao.findById(id);

        if(!enseignant.isPresent()) throw new EnseignantNotFoundException("Cet Enseignat n'existe pas");

        return enseignant;
    }

    @PutMapping (value = "/enseignants")
    public Enseignant UpdateEnseignant(@RequestBody Enseignant enseignant){
        Enseignant newEnseignant = enseignantDao.save(enseignant);

        if(newEnseignant == null) throw new ImpossibleAjouterEnseignantException("Impossible d'ajouter un Enseignant");

        return newEnseignant;
    }

    @DeleteMapping("/enseignant/{IdEnseignant}")
    public void deleteEmploye(@PathVariable(value = "IdEnseignant") long IdEnseignant){
        enseignantDao.deleteById(IdEnseignant);
    }

    }
