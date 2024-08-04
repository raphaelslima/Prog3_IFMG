public class No<String> {
    private String tweetID;
    private String handLabel;
    private String AnnotatorID;
    private No<String> proximo;

    public No(String tweetID, String handLabel, String AnnotatorID) {
        this.tweetID = tweetID;
        this.handLabel = handLabel;
        this.AnnotatorID = AnnotatorID;
        this.proximo = null;
    }

    public No(String tweetID, String handLabel, String AnnotatorID, No<String> proximo) {
        this.tweetID = tweetID;
        this.handLabel = handLabel;
        this.AnnotatorID = AnnotatorID;
        this.proximo = proximo;
    }

    public String getTweetID() {
        return tweetID;
    }

    public String getHandLabel() {
        return tweetID;
    }

    public String getAnnotatorID() {
        return tweetID;
    }

    public void setElemento(String tweetID, String handLabel, String AnnotatorID) {
        this.tweetID = tweetID;
        this.handLabel = handLabel;
        this.AnnotatorID = AnnotatorID;
    }

    public No<String> getProximo() {
        return proximo;
    }

    public void setProximo(No<String> proximo) {
        this.proximo = proximo;
    }

}
