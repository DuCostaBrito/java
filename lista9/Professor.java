package lista9;

public class Professor {
    //Atributos
    private String nome;
    private int matricula;

    //Construtores
    public Professor(){}

    public Professor(String nome) {
        this.setNome(nome);
    }

    public Professor(String nome, int matricula) {
        this(nome);
        this.setMatricula(matricula);
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

    //Metodos
    public void imprimir() {
        System.out.printf("Nome do Professor: %s Matricula: %d \n", this.getNome(), this.getMatricula());
    }
}
