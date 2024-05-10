package me.test.registrationtest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @GetMapping("/")
    public String home(){
        return "Hello there!";
    }

    @GetMapping("/secured")
    public String securedFirstPage(){
        return "Registration successful!";
    }
}
