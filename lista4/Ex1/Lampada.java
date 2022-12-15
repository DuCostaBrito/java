package lista4.Ex1;

public class Lampada {
    //Atributos
    protected boolean ligado;

    //metodos get/set
    public boolean isLigado(){
        return this.ligado;
    }

    public void setLigado() {
        this.ligado = true;
    }

    public void setDesligado() {
        this.ligado = false;
    }
}
