package lista3;

public class FolhaDePagamentoUFPR {
    //Atributos
    FuncionarioUfpr funcionario;
    Data dataPagamento;
    private double salario;

    //Construtor
    public FolhaDePagamentoUFPR(FuncionarioUfpr funcionario, int mes, int ano, double salario) {
        this.funcionario = funcionario;
        this.dataPagamento = new Data(mes, ano);
        this.salario = salario;
    }

    //Metodos get/set
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario > 0)
            this.salario = salario;
    }

    
}
