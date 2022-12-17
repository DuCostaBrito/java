package lista8;

public class ImovelVelho extends Imovel {
    // Construtores
    public ImovelVelho(){}

    public ImovelVelho(Endereco endereco, int preco){
            super(preco, endereco);
        }

    // Metodos get/set

    // Metodos
    public double calcularValorImovel() {
        return (this.preco * 0.8);
    }
}
