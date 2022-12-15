package lista3;

public class FuncionarioUfpr {
    //Atributos
    private String nome;
    private int matricula;
    Data dataNasc;
    private String cargo;

    //Construtor
    public FuncionarioUfpr(String nome, int matricula, Data dataNascimento, String cargo) {
        setNome(nome);
        setMatricula(matricula);
        this.dataNasc = dataNascimento;
        setCargo(cargo);
    }
    
    //Metodos get/set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
