import java.util.Scanner;

public class EstudoVetores {

    public static void main(String[] args) {
//        int [] nums = {1, 2, 3, 4, 5}; //vetor de numeros inteiros
//        System.out.println(nums[4]);
//
//        nums[4] = 8;
//        System.out.println(nums[4]);
//
//        for (int i = 0; i<nums.length; i++){
//            System.out.print(nums[i]);
//        }
//
//        double[] notas = new double[60]; //declara um vetor double vazio com 60 posicoes
//        notas[59]= 5.6;
//        System.out.println(notas[59]);
//
//        String[] nomes = {"Cristian", "Gabriel"};
//        System.out.println(nomes[0]);
//
//
//        for (int i = 0; i<nums.length; i++){
//            System.out.print(nums[i]);
//        }
//        System.out.println();
//
//        for (int num : nums){
//            System.out.print(num);
//        }
//        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numeros de notas:");
        int nNotas = scanner.nextInt();

        double[] notas = new double[nNotas];

        for (int i = 0; i<nNotas; i++) {
            System.out.println("Digite a nota:");
            notas[i] = scanner.nextDouble(); //guarda as notas no vetor

        }

        double media = 0.0;
        for (double nota : notas){
            media += nota;
        }

        media /= nNotas;
        System.out.printf("A media é igual a %.2f", media);




    }
}
