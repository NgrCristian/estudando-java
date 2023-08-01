package Exercicios0108;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static double somarLista(List<Double> numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<Double>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um numero: ");
            double n = scanner.nextDouble();
            numeros.add(n);
        }
        double soma = somarLista(numeros);

        double media = soma / numeros.size();

        System.out.println("A media aritmética dessa lista eh: " + media);
    }
}
