package AulaPratica1;

public class Principal {
    public static void main(String args[]) {
        FuncionarioHorista obj1 = new FuncionarioHorista("eduardo", 2013123, false, 20, 10);
        FuncionarioMensalista obj2 = new FuncionarioMensalista("Gru", 131903, true, 1200);

        obj1.imprimir();
        obj2.imprimir();
    }
}
