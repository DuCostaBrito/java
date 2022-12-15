package AulaPratica1;

public class FuncionarioHorista extends Funcionario{
    //Atributos
    private int valorHora;
    private int numHoras;
    
    //Construtores
    public FuncionarioHorista(){}

    public FuncionarioHorista(String nome, int matricula, boolean estrangeiro, int valorHora, int numHoras) {
        super(nome, matricula, estrangeiro);
        setValorHora(valorHora);
        setNumHoras(numHoras);
    }

    //Metodos get/set
    public int getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumHoras() {
        return this.numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }
}
