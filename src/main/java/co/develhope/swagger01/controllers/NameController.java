package co.develhope.swagger01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    public String name(){
        return "Andrea";
    }

    @GetMapping("")
    public String welcome(){
        return "Welcome to my swagger's initial page";
    }
}
