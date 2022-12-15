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

    //Metodos
    public void exibirDados() {
        System.out.println("Nome do funcionario: " + this.funcionario.getNome());
        System.out.println("Cargo: " + this.funcionario.getCargo());
        System.out.printf("Data de Nascimento: %d/%d/%d \n",this.funcionario.dataNasc.dia, this.funcionario.dataNasc.mes, this.funcionario.dataNasc.ano);
        System.out.println("Matricula: " + this.funcionario.getMatricula());
        System.out.printf("Data de pagamento (Mes/Ano): %d %d \n", this.dataPagamento.mes, this.dataPagamento.ano);
        System.out.println("Salario: " + this.getSalario());
    }
}
