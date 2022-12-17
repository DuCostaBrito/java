package lista8;

public class ImovelNovo extends Imovel{
    
    //Construtores
    public ImovelNovo(){}

    public ImovelNovo(Endereco endereco, int preco){
        super(preco, endereco);
    }

    //Metodos get/set



    //Metodos
    public double calcularValorImovel() {
        return (this.preco * 1.2);
    }
}
