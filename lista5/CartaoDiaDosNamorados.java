package lista5;

public class CartaoDiaDosNamorados extends CartaoWeb{
    public CartaoDiaDosNamorados(){}

    public CartaoDiaDosNamorados(String destinatario) {
        this.destinatario = destinatario;
    }

    public void retornarMensagem(String remetente) {
        System.out.printf("Querido(a) %s, Feliz Dia dos Namorados, %s \n", this.destinatario, remetente);
    }
}
