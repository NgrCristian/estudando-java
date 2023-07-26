public class EstudoOperadores {
    public static void main(String[] args){
        //operadores matematicos
        int a = 10;
        int b = 15;
        int soma = a+b;
        int subtracao = a-b;
        int multiplicacao = a*b;
        double divisao = b / a; // divisao de inteiros, sempre retorna um inteiro
        // divisao correta
        double c = 20;
        double d = 2;
        double div = c / d;
        System.out.println("Divisao de c por d eh: " + div);

        System.out.println("soma " + soma);
        System.out.println("subtracao " + subtracao);
        System.out.println("multiplicacao " + multiplicacao);
        System.out.println("divisao " + divisao);

        //math
        double x = Math.pow(2, 3);
        double y = Math.sqrt(144);
        System.out.println("elevado " + x);
        System.out.println("raiz quadrada " + y);

        //operadores relacionais(>, <, >=, <=, !=)
        boolean teste1 = 10>5; //true
        boolean teste2 = 5<10; //true
        boolean teste3 = 4!=5; //true
        boolean teste4 = 5>=5; //true

        //operadores logicos(&&, ||, !)
        boolean teste7 = true && false; //false
        boolean teste8 = true || false; //true
        boolean teste9 = (5>10) && (8>4);
        boolean teste10 = (10>=0) || (1<5);
        boolean teste11 = !teste7; //true

        //exercicio 1
        //Crie duas variaveis: peso e altura.
        //calcule o imc = peso/ (altura*altura)
        //mostre na tela
        double peso = 65;
        double altura = 1.70;

        double imc = peso / (altura*altura);

        System.out.println("O valor do IMC é: " + imc);
    }
}
