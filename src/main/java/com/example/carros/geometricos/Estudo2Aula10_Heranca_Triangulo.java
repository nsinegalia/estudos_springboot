package com.example.carros.geometricos;

public class Estudo2Aula10_Heranca_Triangulo extends Estudo2Aula10_Heranca_FiguraGeometrica {

    private double base;
    private double altura;

    public Estudo2Aula10_Heranca_Triangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;


    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * altura / 2;
    }

}
