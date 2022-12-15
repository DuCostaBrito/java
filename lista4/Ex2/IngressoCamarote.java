package lista4.Ex2;

public class IngressoCamarote extends IngressoVip{
    //Atributos
    private int valorCamarote;

    //Construtores
    public IngressoCamarote() {
        this.valorCamarote = 10;
    }

    public IngressoCamarote(int valorCamarote) {
        setValorCamarote(valorCamarote);
    }

    //Metodos get/set
    public int getValorCamarote() {
        return this.valorCamarote;
    }

    public void setValorCamarote(int valorCamarote) {
        this.valorCamarote = valorCamarote;
    }

    public void setValor() {
        super.setValor();
        this.valor = this.valor + this.valorCamarote;
    }
}
