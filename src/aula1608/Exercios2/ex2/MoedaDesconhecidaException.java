package aula1608.Exercios2.ex2;

public class MoedaDesconhecidaException extends RuntimeException {

    public MoedaDesconhecidaException() {
    }

    public MoedaDesconhecidaException(String message) {
        super(message);
    }
}
