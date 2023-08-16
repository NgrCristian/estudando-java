package aula1608.exercicios.ex3;

public class SMSNotificacao implements Notificavel {

    private String numDest;

    private String numOrig;

    private String mensagem;

    public SMSNotificacao(String numDest, String numOrig, String mensagem) {
        this.numDest = numDest;
        this.numOrig = numOrig;
        this.mensagem = mensagem;
    }

    @Override
    public void notificar() {
        System.out.println("De: " + numOrig + "\nPara: " + numDest + "\n" + mensagem);
    }
}
