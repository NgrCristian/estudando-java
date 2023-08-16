package aula1608.exceptions.personalizados;

public class EmailMalFormatadoException extends RuntimeException {

    public EmailMalFormatadoException() {
    }

    public EmailMalFormatadoException(String message) {
        super(message);
    }
}