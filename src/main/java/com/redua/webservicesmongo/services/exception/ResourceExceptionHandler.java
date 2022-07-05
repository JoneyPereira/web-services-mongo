package com.redua.webservicesmongo.services.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError> objecNotFound(ObjectNotFoundException e, HttpServletRequest request){
        
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandarError err = new StandarError(System.currentTimeMillis(), status.value(), "Objeto não encontrado", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }    
}
