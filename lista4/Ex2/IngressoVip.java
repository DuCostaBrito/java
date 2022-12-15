package lista4.Ex2;

public class IngressoVip extends Ingresso {
    // Atributos
    private int valorAdicional;

    // Construtores
    public IngressoVip() {
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
    public int getValor() {
        return this.valor + this.valorAdicional;
    }
}
