package com.person.exception;

import org.springframework.validation.Errors;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }

    public Errors getBindingResult() {
        return null;
    }
}
