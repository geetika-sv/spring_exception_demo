package com.example.spring_exception_demo.exceptions;

public class OverNineThousandException extends Exception {

    public OverNineThousandException(int id) {
        super("Power level is too high: "+ id);
    }
}
