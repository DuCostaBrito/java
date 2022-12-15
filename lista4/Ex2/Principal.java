package lista4.Ex2;

public class Principal {
    
    public static void main(String args[]) {
        IngressoVip objV = new IngressoVip();
        IngressoNormal objN = new IngressoNormal();
        IngressoCamarote objC = new IngressoCamarote();

        objV.imprimir();
        objN.imprimir();
        objC.imprimir();
    }
}
