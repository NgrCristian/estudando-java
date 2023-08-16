package aula1608.interfaces;

import aula1608.interfaces.Forma;

public class Quadrado implements Forma {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return lado * 4;
    }
}
