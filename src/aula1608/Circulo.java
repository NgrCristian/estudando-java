package aula1608;

public class Circulo implements Forma{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI *raio;
    }
}
