package aula1508.heranca;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {
        produto batata = new produto("Batata", 8.5F, "1526563");
        System.out.println(batata.getCodigo());
        System.out.println(batata.getNome());
        System.out.println(batata.getPreco());

        livro cleanCode = new livro("Clean Code", 100.0F, "989765949", 300, "123.123.123");
        System.out.println(cleanCode.getCodigo());
        System.out.println(cleanCode.getNome());
        System.out.println(cleanCode.getPreco());
        System.out.println(cleanCode.getIsbn());
        System.out.println(cleanCode.getNumPaginas());

        comida tapioca = new comida("Tapioca", 5.0F, "448165498", LocalDate.of(2023,9,30), 100.0F);
        System.out.println(tapioca.getNome());
        System.out.println(tapioca.getPrazodeValidade());

        carne gado = new carne("Picanha", 100.0F, "6165194", LocalDate.of(2023,12,8),200.0F, "Bovino");
        System.out.println(gado.getNome());

    }
}
