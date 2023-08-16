package aula1608.Exercios2.ex1;

import java.util.ArrayList;
import java.util.List;

public class Event {

    List<String> reservas = new ArrayList<>();

    public void adicionarReserva(String nome) {
        if(reservas.size()+1 > 5) {
            throw new NoMoreSeatsException();
        }
        reservas.add(nome);
        System.out.println("Reserva efetuada.");
    }
}
