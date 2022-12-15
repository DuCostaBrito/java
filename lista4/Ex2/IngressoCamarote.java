package lista4.Ex2;

public class IngressoCamarote extends IngressoVip{
    //Atributos
    private int valorCamarote;

    //Construtores
    public IngressoCamarote() {
        this.valorCamarote = 10;
        setValor();
    }

    public IngressoCamarote(int valorCamarote) {
        setValorCamarote(valorCamarote);
        setValor();
    }

    //Metodos get/set
    public int getValorCamarote() {
        return this.valorCamarote;
    }

    public void setValorCamarote(int valorCamarote) {
        this.valorCamarote = valorCamarote;
    }

    public void setValor() {
        this.valor = this.valor + this.getValorCamarote() + this.getValorAdicional();
    }
}
