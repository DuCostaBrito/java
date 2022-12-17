package AulaPratica2;

public class Celular extends ProdutoEletronico{
    //Atributos

    //Construtores
    public Celular(){}

    public Celular(String fabricante, int peso) {
        this.fabricante = fabricante;
        this.peso = peso;
    }


    //Metodos
    public void vender(){
        System.out.println("Vendendo Celular!!");
    }

    public void acionarGarantia() {
        System.out.println("Garantia Celular: 8 dias");
    }
}
