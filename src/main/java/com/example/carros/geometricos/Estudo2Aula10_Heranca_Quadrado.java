package com.example.carros.geometricos;

public class Estudo2Aula10_Heranca_Quadrado extends Estudo2Aula10_Heranca_FiguraGeometrica{

    private double lado;

    public Estudo2Aula10_Heranca_Quadrado (double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }


}
