package Exercicios0108;

import java.util.Scanner;

public class Exercicio5 {
    // Enum representando as estações do ano
    public enum EstacoesDoAno {
        VERAO,
        OUTONO,
        INVERNO,
        PRIMAVERA
    }

    // Método para obter a estação do ano com base no mês informado
    public static EstacoesDoAno obterEstacao(int mes) {
        switch (mes) {
            case 12:
            case 1:
            case 2:
                return EstacoesDoAno.VERAO;
            case 3:
            case 4:
            case 5:
                return EstacoesDoAno.OUTONO;
            case 6:
            case 7:
            case 8:
                return EstacoesDoAno.INVERNO;
            case 9:
            case 10:
            case 11:
                return EstacoesDoAno.PRIMAVERA;
            default:
                throw new IllegalArgumentException("Mês inválido. Insira um valor entre 1 e 12.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o mês atual (1 a 12): ");
        int mes = scanner.nextInt();

        EstacoesDoAno estacao = obterEstacao(mes);

        System.out.println("Estação do ano correspondente: " + estacao);

    }
}
