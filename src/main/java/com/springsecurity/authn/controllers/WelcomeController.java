package com.springsecurity.authn.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {

    @GetMapping("api/secret")
    public String getMethodName() {
        return "<h1>This is the secret</h1>";
    }

}
