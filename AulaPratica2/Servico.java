package AulaPratica2;

public class Servico implements Loja {
    // Atributos
    String formato;
    int duracao;

    // Construtores
    public Servico() {
    }

    public Servico(String formato) {
        this.setFormato(formato);
    }

    public Servico(String formato, int duracao) {
        this(formato);
        this.duracao = duracao;
    }

    // Metodos get/set
    public String getFormato() {
        return this.formato;
    }

    public void setFormato(String formato) {
        if ((formato == "remoto") || (formato == "loja") || (formato == "domicilio"))
            this.formato = formato;
    }

    // Metodos
    public void vender() {
        System.out.println("Vendendo Servico!!!");
    }

    public void acionarGarantia() {
        System.out.println("Garantia do servico: 3 dias");
    }
}
