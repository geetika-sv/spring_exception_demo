package com.example.spring_exception_demo.config;


import com.example.spring_exception_demo.exceptions.IdNotFoundException;
import com.example.spring_exception_demo.exceptions.OverNineThousandException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpStatusCodeException;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(IdNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String idNotFoundExceptionHandler( IdNotFoundException ex){
        return ex.getMessage();
    }

    @ExceptionHandler(OverNineThousandException.class)
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public String OverNineThousandException(OverNineThousandException ex){
        return ex.getMessage();
    }
}
