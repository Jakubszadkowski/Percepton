package perceptron;

public class Point {
    private double x;
    private double y;
    private int state;

    public Point(double x,double y){
        this.x = x;
        this.y = y;
        this.state = 0;
    }
    public Point(double x ,double y, int state){
        this.x = x;
        this.y = y;
        this.state = state;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public int getState() {
        return this.state;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setState(int state) {
        this.state = state;
    }
    public void setState(Line line) {
        if (line.getA()*getX()+line.getB()+getY()+line.getC() < 0){
           this.state = 0;
        } else {
            this.state = 1;
        }
    }


    @Override
    public String toString(){
        return "x = "+this.x+", y = "+this.y+", state = "+this.state;
    }
}
