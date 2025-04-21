package com.example.carros.controller;

import com.example.carros.geometricos.Estudo2Aula10_Heranca_Circulo;
import com.example.carros.geometricos.Estudo2Aula10_Heranca_FiguraGeometrica;
import com.example.carros.geometricos.Estudo2Aula10_Heranca_Quadrado;
import com.example.carros.geometricos.Estudo2Aula10_Heranca_Triangulo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class CarroController {

    @GetMapping("helloworld")
    public String helloWorld(){
        return "HelloWorld";

    }

    @GetMapping("celulares")
    public List<String> novoMetodo(){
        return List.of("Iphone", "Samsung", "Motorola");
    }

    @GetMapping("geometrico/{numLados}/{tamLados}")
    public String figuraGeometrica(@PathVariable int numLados, @PathVariable int tamLados){

        Estudo2Aula10_Heranca_FiguraGeometrica figuraGeometrica;

        switch (numLados){
            case 2:
                figuraGeometrica = new Estudo2Aula10_Heranca_Circulo(tamLados);
                break;
            case 3:
                figuraGeometrica = new Estudo2Aula10_Heranca_Triangulo(tamLados, tamLados);
                break;
            case 4:
                figuraGeometrica = new Estudo2Aula10_Heranca_Quadrado(tamLados);
                break;

            default: return "Figura não disponível";


        }
        return figuraGeometrica.getText();


    }


}
