package com.person.exception.handler;

import com.person.exception.StudentNotFoundException;
import com.person.exception.TeacherNotFoundException;
import com.person.exception.model.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(StudentNotFoundException.class)
    public ErrorResponse handleStudentNotFoundException(
            StudentNotFoundException exception,
            HttpServletRequest httpServletRequest) {
        return ErrorResponse.builder()
                .message(exception.getMessage())
                .path(httpServletRequest.getServletPath())
                .timestamp(LocalDateTime.now())
                .build();
    }
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(TeacherNotFoundException.class)
    public ErrorResponse handleTeacherNotFoundException(
            TeacherNotFoundException exception,
            HttpServletRequest httpServletRequest) {
        return ErrorResponse.builder()
                .message(exception.getMessage())
                .path(httpServletRequest.getServletPath())
                .timestamp(LocalDateTime.now())
                .build();
    }
}