package AulaPratica1;

public class FuncionarioMensalista extends Funcionario{
    //Atributos
    private int salario;

    //Construtores
    public FuncionarioMensalista(){}
    
    public FuncionarioMensalista(String nome, int matricula, boolean estrangeiro, int salario) {
        super(nome, matricula, estrangeiro);
        setSalario(salario);
    }

    //Metodos get/set
    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //Metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salario: " + this.calculoSalario());
    }

    @Override
    public int calculoSalario() {
        return this.getSalario();
    }
}
