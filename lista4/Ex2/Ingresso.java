package lista4.Ex2;

public class Ingresso {
    // Atributos
    protected int valor;

    // Construtores
    public Ingresso() {
    }

    // Metodos get/set
    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        if (valor > 0)
            this.valor = valor;
    }

    // Metodos
    public void imprimir() {
        System.out.println("Valor do ingresso: " + this.getValor());
    }
}
