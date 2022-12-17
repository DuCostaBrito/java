package lista9;

public class Monitor implements Comparable<Monitor>{
    //Atributos
    private String nome;
    private int matricula;
    private int disciplina;

    //Construtores
    public Monitor(){}

    public Monitor(String nome){
        this.setNome(nome);
    }

    public Monitor(String nome, int matricula){
        this(nome);
        this.setMatricula(matricula);
    }

    public Monitor(String nome, int matricula, int disciplina){
        this(nome, matricula);
        this.setDisciplina(disciplina);
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

    public int getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }

    //Metodos
    public void imprimir() {
        System.out.println("Nome: " + this.getNome() + " Matricula: " + this.getMatricula() + " Disciplina: " + this.getDisciplina());
    }

    public int compareTo(Monitor m) {
        int compare = this.getNome().compareTo(m.getNome());
        return compare;
    }
}
