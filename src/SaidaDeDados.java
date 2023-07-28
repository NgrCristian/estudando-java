import java.util.Arrays;

public class SaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Hello,world"); // quebra linha
        System.out.print("1"); // nao quebra linha
        System.out.print("2");
        System.out.println(); //quebra linha
        System.out.println("Oi \nEu sou java!");

        int n1 = 8;
        int n2 = 10;
        int soma = n1+n2;
        System.out.printf("a soma de %d e %d é igual a %d", n1, n2, soma);


        System.err.println("ERROR 404"); // impressao de erro

        String nome = "Cristian";
        System.out.printf("Bem, vindo, %s!", nome);

        double nu1 = 3.4;
        double nu2 = 12.5;
        double div = nu1 / nu2;
        System.out.printf("a divisao de %f e %f é igual a %f\n", nu2, nu1, div);



    }
}
