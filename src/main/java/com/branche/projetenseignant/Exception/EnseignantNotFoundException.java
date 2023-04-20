package com.branche.projetenseignant.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EnseignantNotFoundException extends Throwable {
    public EnseignantNotFoundException(String message) {
        super(message);
    }
}
