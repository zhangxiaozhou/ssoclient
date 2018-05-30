package com.minshenglife.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world!";
    }

    @RequestMapping("/user/me")
    public Principal user(Principal principal){
        return principal;
    }

}
