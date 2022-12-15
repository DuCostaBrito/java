package AulaPratica1;

public class Funcionario {
    //Atributos
    protected String nome;
    protected int matricula;
    protected boolean estrangeiro;

    //Construtores

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

    public boolean isEstrangeiro() {
        return this.estrangeiro;
    }

    public void setEstrangeiro() {
        this.estrangeiro = !this.estrangeiro;
    }
}
