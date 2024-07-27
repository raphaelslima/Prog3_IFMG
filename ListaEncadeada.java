public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adicionar(T tweetID, T handLabel, T AnnotatorID){
        No<T> celula = new No(tweetID, handLabel, AnnotatorID);
        if(this.tamanho == 0){
            this.inicio = celula;
        }else{
            this.ultimo.setProximo(celula);;
        }
        this.ultimo = celula;
        this.tamanho++;   
    }

    public void adicionar(int pos, T tweetID, T handLabel, T AnnotatorID){
        if(pos == 0){
            if(pos == this.tamanho){
                this.adicionar(tweetID, handLabel, AnnotatorID);
            } else {
                No<T> novoNo = new No(tweetID, handLabel, AnnotatorID, this.inicio);
                this.inicio = novoNo;
                this.tamanho++;
            }
        } else if(pos == this.tamanho){
            this.adicionar(tweetID, handLabel, AnnotatorID);
        } else if(pos > this.tamanho || pos < 0){
            throw new IllegalArgumentException("Posição inválida");
        } else{
           No<T> noAnterior = this.buscaNo(pos-1);
           No<T> noProximo = noAnterior.getProximo();

           No<T> novoNo = new No<T>(tweetID, handLabel, AnnotatorID, noProximo);
           noAnterior.setProximo(novoNo);
           this.tamanho++;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void percorreLista(){
        if(this.tamanho == 0){
            System.out.println("[]");
        }

        No<T> atual = this.inicio;

        if(atual.getProximo() == null){
            System.out.println(atual.getTweetID());
        }else{
            for(int i = 0; i<this.tamanho; i++){
                System.out.println(atual.getTweetID());
                atual = atual.getProximo();
            }
        }      
    }

    public void limpa(){
        No<T> atual = this.inicio;
        for(int i = 0; i < this.tamanho; i++){
            No <T> proximo = atual.getProximo();
            atual.setElemento(null, null, null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> buscaNo(int pos){
        if (!(pos < this.tamanho && pos >= 0)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        No<T> atual = this.inicio;
        for(int i = 0; i < pos; i++){
            atual = atual.getProximo();
        }
        return atual;
    }

    public T buscaPorPosicao(int posicao){
        return this.buscaNo(posicao).getTweetID();
    }

    public int busca(T tweetID){
        No<T> atual = this.inicio;
        int pos = 0;

        for(int i = 0; i < this.tamanho; i++){

            if(atual.getTweetID().equals(tweetID)){
                return pos;
            }

            pos++;
            atual = atual.getProximo();
        }
        
        return -1;
    }

    public T removePrimeiro(){
        if(this.tamanho == 0){
            throw new RuntimeException("Lista vazia");
        } else {
            T removido = this.inicio.getTweetID();
            this.inicio = this.inicio.getProximo();
            this.tamanho--;

            if (this.tamanho == 0) {
                this.ultimo = null;
            }
            return removido;
        }
    }

    public T removeUltimo(){
        if(this.tamanho == 0){
            throw new RuntimeException("Lista vazia");
        }
        if(this.tamanho == 1){
            this.removePrimeiro();
        }

        No<T> noAnterior = this.buscaNo(this.tamanho -2);
        T removido = noAnterior.getProximo().getTweetID();
        noAnterior.setProximo(null);
        this.ultimo = noAnterior;
        this.tamanho--;
        return removido;
    }

    public T removeMeio(int pos){
        if(!(pos >= 0 || pos < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        if(pos == 0){
            return this.removePrimeiro();
        } else if (pos == this.tamanho-1) {
            return this.removeUltimo();
        } else {
            No<T> noAnterior = this.buscaNo(pos-1);
            No<T> noAtual = noAnterior.getProximo();
            noAnterior.setProximo(noAtual.getProximo());
            noAtual.setProximo(null);
            this.tamanho--;
            return noAtual.getTweetID();
        }
    }

    @Override
    public String toString() {
        return "listaEncadeada [inicio=" + inicio + "]";
    }
}

