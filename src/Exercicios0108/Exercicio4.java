package Exercicios0108;

import java.util.Scanner;

public class Exercicio4 {
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean resultado = isPrimo(numero);

        System.out.println(numero + " é primo? " + resultado);
    }
}