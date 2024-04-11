public class PostInfos {
    private long likesTotais;
    private long qtdeInteracao;
    private String tipo;
    private String categoria;
    private String comentarios;
    private String compartilhamentos;
    private boolean ehPago;

    public void Post(long likesTotais, long qtdeInteracao, String tipo, String categoria, String comentarios,
            String compartilhamentos, boolean ehPago) {
        this.likesTotais = likesTotais;
        this.qtdeInteracao = qtdeInteracao;
        this.tipo = tipo;
        this.categoria = categoria;
        this.comentarios = comentarios;
        this.compartilhamentos = compartilhamentos;
        this.ehPago = ehPago;
    }

    public long getLikesTotais() {
        return likesTotais;
    }

    public void setLikesTotais(long likesTotais) {
        this.likesTotais = likesTotais;
    }

    public long getQtdeInteracao() {
        return qtdeInteracao;
    }

    public void setInteracao(long qtdeInteracao) {
        this.qtdeInteracao = qtdeInteracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String categoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String comentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String compartilhamentos() {
        return comentarios;
    }

    public void setCompartilhamentos(String comentarios) {
        this.compartilhamentos = compartilhamentos;
    }

    public boolean ehPago() {
        return ehPago;
    }

    public void setEhPago(boolean ehPago) {
        this.ehPago = ehPago;
    }

    // imprima tudo!
    public void imprimeTudo() {
        System.out.println("Likes Totais: " + likesTotais);
        System.out.println("Quantidade de interações: " + qtdeInteracao);
        System.out.println("Tipo de post: " + tipo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade de comentários: " + comentarios);
        System.out.println("Quantidade de compartilhamentos: " + compartilhamentos);
        System.out.println("O post é monetizado? 1 para sim 0 para não: " + ehPago);
    }

}