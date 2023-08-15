package aula1508.heranca;

import java.time.LocalDate;

public class carne extends comida{
    private String categoria;

    public carne() {
        super();
    }

    public carne(String nome, Float preco, String codigo, LocalDate prazodeValidade, Float caloria, String categoria) {
        super(nome, preco, codigo, prazodeValidade, caloria);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
