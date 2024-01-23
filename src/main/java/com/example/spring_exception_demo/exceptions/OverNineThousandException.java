package com.example.spring_exception_demo.exceptions;

public class OverNineThousandException extends Exception {

    public OverNineThousandException(int id) {
        super("Id not found: "+ id);
    }
}
