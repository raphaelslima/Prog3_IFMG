public class No<T> {
    private T tweetID;
    private T handLabel;
    private T AnnotatorID;
    private No<T> proximo;

    public No(T tweetID, T handLabel, T AnnotatorID) {
        this.tweetID = tweetID;
        this.handLabel = handLabel;
        this.AnnotatorID = AnnotatorID;
        this.proximo = null;
    }

    public No(T tweetID, T handLabel, T AnnotatorID, No<T> proximo) {
        this.tweetID = tweetID;
        this.handLabel = handLabel;
        this.AnnotatorID = AnnotatorID;
        this.proximo = proximo;
    }

    public T getTweetID() {
        return tweetID;
    }

    public T getHandLabel() {
        return tweetID;
    }

    public T getAnnotatorID() {
        return tweetID;
    }

    public void setElemento(T tweetID, T handLabel, T AnnotatorID) {
        this.tweetID = tweetID;
        this.handLabel = handLabel;
        this.AnnotatorID = AnnotatorID;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No [elemento=" + tweetID + ", proximo=" + proximo + "]";
    }

    
}

