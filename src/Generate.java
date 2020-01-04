import java.util.Random;

public class Generate {
    private int firstNum;
    private int secondNum;
    private int symbol;
    private double result;
    Random rd = new Random();

    public Generate() {
    }
    public Generate Generate(){
        Generate gen = new Generate();
        gen.firstNum = this.getFirstNum();
        gen.secondNum = this.getSecondNum();
        gen.symbol = this.getSymbol(gen.firstNum,gen.secondNum);
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
            case 4:{// /
                this.result = this.firstNum / this.secondNum;
            }
        }
        return gen;
    }
    public int getFirstNum() {
        firstNum = rd.nextInt();
        return firstNum;
    }

    public int getSecondNum() {
        secondNum = rd.nextInt();
        return secondNum;
    }

    public int getSymbol(int x, int y) {
        if(y==0) return rd.nextInt(3);
        symbol = rd.nextInt(4);
        return symbol;
    }
}
