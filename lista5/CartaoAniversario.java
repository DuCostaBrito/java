package lista5;

public class CartaoAniversario extends CartaoWeb{
    
    public CartaoAniversario(){}

    public CartaoAniversario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void retornarMensagem(String remetente) {
        System.out.printf("Querido(a) %s, Feliz Aniversario, %s", remetente, this.destinatario);
    }
}
