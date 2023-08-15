package aula1508.heranca;

import java.time.LocalDate;

public class comida extends produto {

    private LocalDate prazodeValidade;
    private Float caloria;

    public comida() {
        super();
    }

    public comida(String nome, Float preco, String codigo, LocalDate prazodeValidade, Float caloria) {
        super(nome, preco, codigo);
        this.prazodeValidade = prazodeValidade;
        this.caloria = caloria;
    }

    public LocalDate getPrazodeValidade() {
        return prazodeValidade;
    }

    public void setPrazodeValidade(LocalDate prazodeValidade) {
        this.prazodeValidade = prazodeValidade;
    }

    public Float getCaloria() {
        return caloria;
    }

    public void setCaloria(Float caloria) {
        this.caloria = caloria;
    }
}
