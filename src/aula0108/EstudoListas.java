package aula0108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstudoListas {
    public static void main(String[] args) {

//Integer, Double, Boolean, Long, Float -> Wrapper(representação de tipo primitivo como objeto);
        List <Integer> lista = new ArrayList<Integer>();
        lista.add(8);
        lista.add(15);
        lista.add(5);
        lista.add(3);
        lista.add(7);
        lista.add(0,10);

        System.out.println(lista.get(0));
        lista.remove(2);
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i));
        }

        System.out.println();

        for (Integer numero : lista) {
            System.out.print(numero);
        }

        System.out.println();

        Collections.sort(lista);
        for (Integer numero : lista) {
            System.out.print(numero);
        }

        System.out.println();

        List<String> nomes = new ArrayList<String>(List.of("Gabriel", "Cristian", "Joao", "Maria"));
        Collections.sort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
