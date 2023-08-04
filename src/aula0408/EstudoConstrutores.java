package aula0408;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudoConstrutores {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<String>();
        produtos.add("sapato");
        produtos.add("cerveja");
        produtos.add("livro");
        produtos.add("bolsa");
        Venda venda = new Venda(LocalDate.now(), "Jose", produtos, 300.0);

        Venda venda1 = new Venda();
        Venda venda2 = new Venda(LocalDate.now());
        Venda venda3 = new Venda("Joao", LocalDate.now());

        System.out.println(venda);
        // so le dessa maneira por conta do to String na class Venda.java(no final da pagina)
    }
}
