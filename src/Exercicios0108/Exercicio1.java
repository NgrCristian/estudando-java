package Exercicios0108;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> lista = new ArrayList<Double>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um numero: ");
            double numero = scanner.nextDouble();
            lista.add(numero);
        }

        Double maior = lista.get(0);
        Double menor = lista.get(0);

        for (Double numero : lista) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior numero eh: " + maior);
        System.out.println("O menor numero eh: " + menor);

    }
}