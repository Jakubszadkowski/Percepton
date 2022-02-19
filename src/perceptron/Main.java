package perceptron;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Neuron neuron = new Neuron((rand.nextDouble() * 300) - 50, (rand.nextDouble() * 300) - 50, (rand.nextDouble() * 300) - 50);
        Line line = new Line(-1, 5, 3);
        List<Point> points = generator(1100, line);
        List<Point> testList = generator(200, line);
        int runs = 70;

        for (int currentCycle =1; currentCycle <= runs ; currentCycle++){
            System.out.println("Round: "+ currentCycle + " neuron learned : " + neuron.learn(points, runs, currentCycle) +", neuron tested : "+neuron.analyze(testList) );
        }

    }


    public static List<Point> generator(int size,Line line){
        List<Point> pointList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0 ; i < size ; i++){
            pointList.add(new Point((rand.nextDouble() * 100) - 50,(rand.nextDouble() * 100) - 50));
            pointList.get(pointList.size()-1).setState(line);
        }
        return pointList;
    }
}
