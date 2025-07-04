package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            double radius = Math.random() * 10;
            circles[i] = new Circle(radius);

            System.out.println("Number of instances: " + Circle.numberOfCircleInstances);
            String description = Util.circleToString(circles[i]);
            System.out.println(description);
        }


        /*Random random = new Random();
        Circle circle1 = new Circle(random.nextDouble() * 10);
        System.out.println("Number of instances: " + Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle1));

        Circle circle2 = new Circle(random.nextDouble() * 10);
        System.out.println("Number of instances: " + Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle2));

        Circle circle3 = new Circle(random.nextDouble() * 10);
        System.out.println("Number of instances: " + Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle3));

        Circle circle4 = new Circle(random.nextDouble() * 10);
        System.out.println("Number of instances: " + Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle4));

        Circle circle5 = new Circle(random.nextDouble() * 10);
        System.out.println("Number of instances: " + Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle5));*/

    }
}
