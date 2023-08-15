package aula2607;

public class EstudoVariaveis {
    public static void main(String[] args){

        int estoque = 150; // ate 2 bilhoes
        long populacaoTerra = 7900000000L; //ate quintilhoes
        double salario = 1500.99; // ate 15 casa de precisao
        float nota = 7.5F; //ate 7 casas de precisao
        boolean ativo = true; //true ou false
        String nome = "Cristian Negrini"; //sempre aspas duplas
        char letra = 'A'; // aspas simples e representa um unico caractere

        //Tipagem Forte
        int a = 1000;
        a = 2000;
        System.out.println("populacao da terra:" + populacaoTerra);
    }
}

