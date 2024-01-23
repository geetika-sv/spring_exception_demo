package com.example.spring_exception_demo.controllers;

import com.example.spring_exception_demo.exceptions.IdNotFoundException;
import com.example.spring_exception_demo.exceptions.OverNineThousandException;
import com.example.spring_exception_demo.models.User;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @GetMapping("/test/{id}")
    public String getTest(@PathVariable int id) throws IdNotFoundException, OverNineThousandException {

        if(id > 9000){
            throw new OverNineThousandException(id);
        }


        if (id > 10) {

            throw new IdNotFoundException(id);
        }
        return "Found id: " + id;
    }

    @PostMapping("/users")
    @Validated
    public User createUser(@RequestBody @Valid User user) {
        return user;
    }

}
