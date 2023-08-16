package aula1608;

public class Main {

    public static void mostrarAreaForma(Forma forma){
        System.out.println("Area" + forma.calculaArea());
        System.out.println("Perimetro" + forma.calculaPerimetro());
    }
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(6);
        Triangulo triangulo = new Triangulo(8,6);
        Circulo circulo = new Circulo(4);

        System.out.println("\n Quadrado");
        mostrarAreaForma(quadrado);

        System.out.println("\n Triangulo");
        mostrarAreaForma(triangulo);

        System.out.println("\n Circulo");
        mostrarAreaForma(circulo);

    }
}
