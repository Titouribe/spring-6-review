package com.spring_framework_6_basic.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class BaseAppControllerAdvice {

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<Object> handleGeneralExceptions(
            Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(String.format("Unexpected error: %s", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
