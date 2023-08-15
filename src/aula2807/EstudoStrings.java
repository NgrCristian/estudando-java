package aula2807;

import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
//        String java = "Java";
//        System.out.println(java.toLowerCase());// minusculo
//        System.out.println(java.toUpperCase());// maiusculo
//        System.out.println(java.charAt()); //caractere com base na sua posição
//        System.out.println(java.indexOf("a")); // indice do primeiro caractere da substring
//        System.out.println(java.replace(target:"v", replacement:"c"));
//        System.out.println(java.replaceAll(regex:"a", replacement:"i"));
//        System.out.println(java.substring(2, 4));
//        System.out.println(java.length());//tamanho do texto
//
//
//        String nome1 = "Cristian";
//        String nome2 = "Cristian";
//        System.out.println(nome1 == nome2); //compara os objetos nome 1 e nome 2
//        System.out.println(nome1.equals(nome2)); //compara os textos de nome1 e nome2

        Scanner scanner = new Scanner(System.in);

        String texto = "Vamos para o break retornamos as 10:35";
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        if(palavra.isEmpty()){
            System.out.println("Conteudo vazio");
        }
        else if (texto.contains(palavra)){
            System.out.println(("Contem"));
        }
        else {
            System.out.println("Nao contem");
        }


//        System.out.println(" ".isEmpty()); //false
//        System.out.println(" ".isBlank()); //true
    }
}
