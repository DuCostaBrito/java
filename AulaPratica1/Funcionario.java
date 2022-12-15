package AulaPratica1;

public class Funcionario {
    // Atributos
    protected String nome;
    protected int matricula;
    protected boolean estrangeiro;

    // Construtores
    public Funcionario() {
    }

    public Funcionario(String nome, int matricula, boolean estrangeiro) {
        setNome(nome);
        setMatricula(matricula);
        setEstrangeiro(estrangeiro);
    }

    // Metodos get/set
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

    public boolean isEstrangeiro() {
        return this.estrangeiro;
    }

    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    //Metodos
    public void imprimir() {
        System.out.println("Nome do Funcionario: " + this.getNome());
        System.out.println("Matricula do Funcionario: " + this.getMatricula());
        if (isEstrangeiro())
            System.out.println("Funcionario Estrangeiro");
        else   
            System.out.println("Funcionario Nativo");
    }
}
