public class PostTime {
    private int postHora;
    private int postSemana;
    private int postMes;

    public PostTime(int postHora, int postSemana, int postMes) {
        this.postHora = postHora;
        this.postSemana = postSemana;
        this.postMes = postMes;
    }

    public void setPostHora(int postHora) {
        this.postHora = postHora;
    }

    public void setPostSemana(int postSemana) {
        this.postSemana = postSemana;
    }

    public void setPostMes(int postMes) {
        this.postMes = postMes;
    }

    public int getPostHora() {
        return postHora;
    }

    public int getPostSemana() {
        return postSemana;
    }

    public int getPostMes() {
        return postMes;
    }

    // imprima tudo!
    public void imprimeTudo() {
        System.out.println("Hora da postagem: " + postHora);
        System.out.println("Semana da postagem: " + postSemana);
        System.out.println("Mês da postagem: " + postMes);
    }

}
