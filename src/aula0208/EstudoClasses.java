package aula0208;

public class EstudoClasses {
    public static void main(String[] args) {
        Fruta maca = new Fruta();
        maca.nome = "Maça";
        maca.cor = "Vermelha";
        maca.acidez = 7;
        maca.suculencia = true;
        maca.amadurecer(37);
        maca.vitaminas = new String[3];
        maca.vitaminas[0] = "Vitamina A";
        maca.vitaminas[1] = "Vitamina B";
        maca.vitaminas[2] = "Vitamina C";


        System.out.println(maca.maduro);
    }
}
