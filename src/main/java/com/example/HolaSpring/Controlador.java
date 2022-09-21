package com.example.HolaSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    
@GetMapping("/")
    public String mensaje(){
    System.out.println("mensaje exitoso");
    return "Hola, esta es una prueba";
}
    
}
