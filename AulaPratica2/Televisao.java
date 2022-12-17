package AulaPratica2;

public class Televisao extends ProdutoEletronico{
    //Atributos

    //Construtores
    public Televisao(){}

    public Televisao(String fabricante, int peso) {
        this.fabricante = fabricante;
        this.peso = peso;
    }


    //Metodos
    public void vender(){
        System.out.println("Vendendo televisao!!");
    }

    public void acionarGarantia() {
        System.out.println("Garantia televisao: 10 dias");
    }
}
