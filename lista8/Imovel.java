package lista8;

public abstract class Imovel {
    //Atributos
    protected Endereco endereco;
    protected int preco;

    //Construtores
    public Imovel(){}
    
    public Imovel(int preco) {
        setPreco(preco);
    }

    public Imovel(int preco, Endereco endereco) {
        this(preco);
        setEndereco(endereco);
    }

    //Metodos get/set
    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //Metodos
    public abstract double calcularValorImovel();
}
