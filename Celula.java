public class Celula<T> {
    public Celula(String linguagem, int contadorPos) {
        this.linguagem = linguagem;
        this.prox = null;
        this.contadorPos = contadorPos;
    }

    String linguagem;
    int contadorPos;
    Celula<T> prox;

}