package AulaPratica2;

public abstract class ProdutoEletronico implements Loja{
    //Atributos
    protected String fabricante;
    protected int peso;

    //Metodos
    public void vender(){
        System.out.println("Vendendo produto eletronico!!!");
    }

    public void acionarGarantia(){
        System.out.println("Garantia do produto: 80 dias");
    }
}
