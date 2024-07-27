package com.person.exception;

import org.springframework.validation.Errors;

public class TeacherNotFoundException extends RuntimeException {
    public TeacherNotFoundException(String message) {
        super(message);
    }

    public Errors getBindingResult() {
        return null;
    }
}
