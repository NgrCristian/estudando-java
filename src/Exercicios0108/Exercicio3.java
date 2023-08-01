package Exercicios0108;

import java.time.LocalDate;

public class Exercicio3 {
    public static void main(String[] args) {
        // Obtém a data atual
        LocalDate dataAtual = LocalDate.now();

        // Adiciona três semanas à data atual
        LocalDate dataDaquiATresSemanas = dataAtual.plusWeeks(3);

        // Exibe a data daqui a três semanas
        System.out.println("Data daqui a três semanas: " + dataDaquiATresSemanas);
    }
}
