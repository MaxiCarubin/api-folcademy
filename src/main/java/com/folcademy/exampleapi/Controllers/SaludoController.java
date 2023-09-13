package com.folcademy.exampleapi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoController {

    @GetMapping
    public String hello(){
        return "Hola mundo!";
    }

    @PostMapping
    public String goodbye(){
        return "Adios, Hasta luego!";
    }

}
