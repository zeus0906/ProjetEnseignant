package com.branche.projetenseignant.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ImpossibleAjouterEnseignantException extends RuntimeException {

    public ImpossibleAjouterEnseignantException(String message) {
        super(message);
    }
}
