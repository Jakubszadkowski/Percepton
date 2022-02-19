package perceptron;

import java.util.List;

public class Neuron {
    private double wage1;
    private double wage2;
    private double wage3;
    private double change;
    public Neuron(double wage1,double wage2,double wage3){
        this.wage1 = wage1;
        this.wage2 = wage2;
        this.wage2 = wage3;
        this.change = 0.00001;
    }
    public double learn(List<Point> points, int run, int currentRun) {
        double accurate = 0;
        for (Point p : points) {
            int calculatedState;
            if(p.getX() * getWage1() + p.getY() * getWage2() + getWage3() < 0){
                calculatedState = 0;
            } else {
                calculatedState = 1;
            }
            if (p.getState() != calculatedState){
                double e = p.getState() - calculatedState;
                setWage1(getWage1() + e * p.getX() * change * (run - currentRun));
                setWage2(getWage2() + e * p.getY() * change * (run - currentRun));
                setWage3(getWage3() + e);
            }
            else {
                accurate++;
            }
        }
        return accurate/points.size();
    }

    public double analyze(List<Point> testPoint) {
        double correct = 0;
        int calculatedState;
        for (Point p : testPoint) {
            if (p.getX() * getWage1() + p.getY() * getWage2() + getWage3() <0){
                calculatedState = 0;
            }else {
                calculatedState = 1;
            }
            if (p.getState() == calculatedState){
                correct++;
            }
        }
        return correct/testPoint.size();
    }

    public void setWage1(double wage1){
        this.wage1=wage1;
    }
    public void setWage2(double wage2){
        this.wage2=wage2;
    }
    public void setWage3(double wage3){
        this.wage3=wage3;
    }
    public void setChange(double change){
        this.change=change;
    }
    public double getChange(){
        return this.change;
    }
    public double getWage1() {
        return this.wage1;
    }
    public double getWage2() {
        return this.wage2;
    }
    public double getWage3() {
        return this.wage3;
    }
}
