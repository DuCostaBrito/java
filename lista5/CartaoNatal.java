package lista5;

public class CartaoNatal extends CartaoWeb{
    public CartaoNatal(){}

    public CartaoNatal(String destinatario) {
        this.destinatario = destinatario;
    }

    public void retornarMensagem(String remetente) {
        System.out.printf("Querido(a) %s, Feliz Natal HO HO HO, %s", remetente, this.destinatario);
    }
}
