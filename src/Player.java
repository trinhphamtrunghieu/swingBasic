public class Player {
    public Player(){
    }
    private int skipQ = 0;
    private int trueQ = 0;
    private int falseQ = 0;
    private Generate generate = new Generate();
    public Generate getGenerator(){
        return generate;
    }
    public void generate(){
        this.generate = new Generate().Generate();
    }
    public int getSkipQ() {
        return skipQ;
    }

    public void setSkipQ(int skipQ) {
        this.skipQ = skipQ;
    }

    public int getTrueQ() {
        return trueQ;
    }

    public void setTrueQ(int trueQ) {
        this.trueQ = trueQ;
    }

    public int getFalseQ() {
        return falseQ;
    }

    public void setFalseQ(int falseQ) {
        this.falseQ = falseQ;
    }
}
