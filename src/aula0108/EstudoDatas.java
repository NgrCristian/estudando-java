package aula0108;

import javax.swing.text.DateFormatter;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EstudoDatas {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);

        System.out.println(dataHoraAtual.getYear());
        System.out.println(dataHoraAtual.getMonthValue());
        System.out.println(dataHoraAtual.getDayOfMonth());
        System.out.println(dataHoraAtual.getHour());
        System.out.println(dataHoraAtual.getMinute());

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraAtualFormatada = dataHoraAtual.format(formatoBr);
        System.out.println("Data formatada : " + dataHoraAtualFormatada);

        int ano = 2023;
        int mes = 12;
        int dia = 7;
        LocalDate dataValida = LocalDate.of(ano, mes, dia);
        System.out.println(dataValida);

        LocalDate hoje1 = LocalDate.now();
        LocalDate data = LocalDate.of(2023, 8, 2);
//        String dataString = "2023-07-14";
//        LocalDate dataValida2 = LocalDate.parse(dataString);

        if (hoje1.isAfter(data)) {
            System.out.println("A data ja passou!");
        }
        else {
            System.out.println("A data ainda nao passou!");
        }

        hoje1.isAfter(data); // é depois?
        hoje1.isBefore(data); // é antes?



    }

}
