package lista4.Ex2;

public class IngressoVip extends Ingresso {
    // Atributos
    private int valorAdicional;

    // Construtores
    public IngressoVip() {
        this.valorAdicional = 8;
        setValor();
    }

    public IngressoVip(int valorAdicional) {
        this.valorAdicional = valorAdicional;
        setValor();
    }

    // Metodos get/set
    public int getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(int valorAdicional) {
        if (valorAdicional > 0)
            this.valorAdicional = valorAdicional;
    }

    // Metodos Sobrepostos
    public void setValor() {
        this.valor = this.valor + this.valorAdicional;
    }
}
