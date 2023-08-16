package aula1608.exceptions.personalizados;

public class TamanhoEmailExcedidoException extends RuntimeException {

    public TamanhoEmailExcedidoException() {
    }

    public TamanhoEmailExcedidoException(String message) {
        super(message);
    }
}
