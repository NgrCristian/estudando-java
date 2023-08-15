package aula1508.heranca;

public class livro extends produto {

    private Integer numPaginas;
    private String isbn;

    public livro() {
        super();
    }

    public livro(String nome, Float preco, String codigo, Integer numPaginas, String isbn) {
        super(nome, preco, codigo);
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}