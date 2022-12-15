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

    //Metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor Hora: " + this.getValorHora());
        System.out.println("Horas Trabalhadas: " + this.getNumHoras());
    }

    @Override
    public int calculoSalario() {
        return (this.getNumHoras() * this.getNumHoras());
    }
}
