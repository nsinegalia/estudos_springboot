package com.example.carros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class CarroController {

    @GetMapping("helloworld")
    public String helloWorld() {
        return "HelloWorld";

    }

    @GetMapping("celulares")
    public List<String> novoMetodo() {
        return List.of("Iphone", "Samsung", "Motorola");
    }


}
