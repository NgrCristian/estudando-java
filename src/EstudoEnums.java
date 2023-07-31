enum NivelAcesso {
    COMUM, USUARIO, ADMINISTRADOR
}
class Pessoa {
    String nome;
    int idade;
    NivelAcesso nivelAcesso;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.nivelAcesso = nivelAcesso;
    }
}

public class EstudoEnums {

    public static void main(String[] args) {
        Pessoa cristian = new Pessoa();
        cristian.nome = "Cristian";
        cristian.idade= 18;
        cristian.nivelAcesso = NivelAcesso.USUARIO;

        if(cristian.nivelAcesso == NivelAcesso.ADMINISTRADOR){
            System.out.println("Libera Tudo");
        }
        else if(cristian.nivelAcesso == NivelAcesso.USUARIO){
            System.out.println("Libera somente area privada");
        }
        else if(cristian.nivelAcesso == NivelAcesso.COMUM){
            System.out.println("Libera somente area publica");
        }
    }
}
