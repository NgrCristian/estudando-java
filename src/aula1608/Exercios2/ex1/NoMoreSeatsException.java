package aula1608.Exercios2.ex1;

public class NoMoreSeatsException extends RuntimeException {

    public NoMoreSeatsException() {
    }

    public NoMoreSeatsException(String message) {
        super(message);
    }
}
