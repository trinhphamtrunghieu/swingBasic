import java.util.Random;

public class Generate {
    private float firstNum;
    private float secondNum;
    private int symbol;
    private double result;
    Random rd = new Random();

    public Generate() {
        System.out.println("Calling default");
    }
    public Generate Generate() {
        this.setFirstNum();
        this.setSecondNum();
        this.symbol = this.setSymbol(this.firstNum,this.secondNum);
        switch(symbol){
            case 0: { // +
                this.result = this.firstNum + this.secondNum;
                break;
            }
            case 1:{ //-
                this.result = this.firstNum - this.secondNum;
                break;
            }
            case 2:{// *
                this.result = this.firstNum * this.secondNum;
                break;
            }
            case 3:{// /
                this.result = this.firstNum / this.secondNum;
                break;
            }
        }
        return this;
    }
    private void setFirstNum() {
        this.firstNum = rd.nextInt(100);
    }

    private void setSecondNum() {
        this.secondNum = rd.nextInt(100);
    }

    private int setSymbol(float x, float y) {
        if(y==0) return rd.nextInt(3);
        symbol = rd.nextInt(4);
        return symbol;
    }

    public float getFirstNum() {
        return firstNum;
    }

    public float getSecondNum() {
        return secondNum;
    }

    public int getSymbol() {
        return symbol;
    }

    public double getResult() {
        return result;
    }
}
