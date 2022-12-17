package AulaPratica2;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    
    public static void main(String args[]){
        ProdutoEletronico obj1 = new Televisao("Sony", 200);
        Servico obj2 = new Servico("loja", 103);
        ArrayList<Loja> lista = new ArrayList<Loja>(2);
        
        lista.add(obj2);
        lista.add(obj1);

        Iterator<Loja> i = lista.iterator();
        while (i.hasNext()) {
            Loja tmp = i.next();
            tmp.vender();
            tmp.acionarGarantia();
        }
    }
}
