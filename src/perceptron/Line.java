package perceptron;

public class Line {
    private int a;
    private int b;
    private int c;

    public Line(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }

    public int getC() {
        return this.c;
    }
}
