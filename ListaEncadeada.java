import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;
    Celula<String> firstCell;

    public ListaEncadeada() {
        this.firstCell = null;

    }

    public void adicionar(String tweetID, String handLabel, String AnnotatorID) {
        No<T> celula = new No(tweetID, handLabel, AnnotatorID);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
            ;
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionar(int pos, String tweetID, String handLabel, String AnnotatorID) {
        if (pos == 0) {
            if (pos == this.tamanho) {
                this.adicionar(tweetID, handLabel, AnnotatorID);
            } else {
                No<T> novoNo = new No(tweetID, handLabel, AnnotatorID, this.inicio);
                this.inicio = novoNo;
                this.tamanho++;
            }
        } else if (pos == this.tamanho) {
            this.adicionar(tweetID, handLabel, AnnotatorID);
        } else if (pos > this.tamanho || pos < 0) {
            throw new IllegalArgumentException("Posição inválida");
        } else {
            No<T> noAnterior = this.buscaNo(pos - 1);
            No<T> noProximo = noAnterior.getProximo();

            No<T> novoNo = new No(tweetID, handLabel, AnnotatorID, noProximo);
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
        } else{
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

    public void tranformaArquivoParaLista(String file, ListaEncadeada<T> ListaEncadeada){
        boolean pular1Linha = true;
        try (Scanner scanner = new Scanner(new File(file))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (!pular1Linha) {
                    int primeiraVirgula = linha.indexOf(',');
                    int segundaVirgula = linha.indexOf(',', primeiraVirgula + 1);
        
                    String tweetID = linha.substring(0, primeiraVirgula);
                    String handLabel = linha.substring(primeiraVirgula + 1, segundaVirgula);
                    String AnnotatorID = linha.substring(segundaVirgula + 1);

                    ListaEncadeada.adicionar(tweetID, handLabel, AnnotatorID);
                }else{
                    pular1Linha = false;
                }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean empty() {
        return (firstCell == null);
    }

    public void insertAtMiddle(String linguagem, int contadorPos) {
        Celula<String> celula = new Celula<>(linguagem, contadorPos);
        if (empty() || firstCell.contadorPos < contadorPos) {
            celula.prox = firstCell;
            firstCell = celula;
        } else {
            Celula<String> atual = firstCell;
            while (atual.prox != null && atual.prox.contadorPos >= contadorPos) {
                atual = atual.prox;
            }
            celula.prox = atual.prox;
            atual.prox = celula;
        }
    }

    public void printer() {
        Celula<String> aux = firstCell;
        while (aux != null) {
            System.out.println("Idioma: " + aux.linguagem + " " + aux.contadorPos);
            aux = aux.prox;
        }
    }

    public void sentimento() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String idiomaPositivo = null;
        String idiomaNegativo = null;
        int contadorTotalPos = 0;
        int contadorTotalNeg = 0;

        String caminho = "./languages";
        File diretorio = new File(caminho);
        File arquivos[] = diretorio.listFiles();

        if (arquivos == null) {
            System.out.println("Arquivo não encontrado");
        }

        for (File caminhoCSV : arquivos) {
            String listaArquivo = caminhoCSV.getName();
            int contador = 0;
            int contadorNeg = 0;
            boolean pular1linha = true;

            try (BufferedReader br = new BufferedReader(new FileReader(caminhoCSV.getAbsolutePath()))) {
                String linha;

                while ((linha = br.readLine()) != null) {
                    if (pular1linha) {
                        pular1linha = false;
                        continue;
                    }
                    String partes[] = linha.split(",");
                    if (partes.length >= 3) {
                        if (partes[1].equals("Positive")) {
                            contador += 1;
                            contadorTotalPos++;
                            this.adicionar(caminhoCSV.getName(), partes[1], partes[2]);
                        } else if (partes[1].equals("Negative")) {
                            contadorNeg += 1;
                            contadorTotalNeg++;
                            this.adicionar(caminhoCSV.getName(), partes[1], partes[2]);
                        }
                    }
                }

                if (contador > max) {
                    max = contador;
                    idiomaPositivo = caminhoCSV.getName();
                }

                if (contadorNeg < min) {
                    min = contadorNeg;
                    idiomaNegativo = caminhoCSV.getName();
                }
                insertAtMiddle(listaArquivo, (contador));
                insertAtMiddle(listaArquivo, contadorNeg);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("O idioma mais positivo é: " + idiomaPositivo + ", com " + max);
        System.out.println("O idioma menos positivo é: " + idiomaNegativo + ", com " + min);
        System.out.println("Twitters positivos totais: " + contadorTotalPos);
        System.out.println("Twitters negativos totais: " + contadorTotalNeg);
        printer();
    }
}
