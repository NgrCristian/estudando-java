package aula1608.interfaces;

import aula1608.interfaces.Forma;

public class Triangulo implements Forma {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (base * altura)/2;
    }

    @Override
    public double calculaPerimetro() {
        return base * 3;
    }
}
