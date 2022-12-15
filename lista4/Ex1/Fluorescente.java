package lista4.Ex1;

public class Fluorescente extends Lampada{
    //Atributos
    private int comprimento;


    //Metodos get/set
    public int getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(int comprimento) {
        if (comprimento > 0)
            this.comprimento = comprimento;
    }
}
