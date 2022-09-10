package task9;

import task9.Ball.Ball;
import task9.Ball.Color;
import task9.Basket.Basket;

public class Program {
    public static void main(String[] args) {
        Basket<Ball> basket = new Basket<Ball>();
        basket.put(new Ball(2.3, Color.BLUE));
        basket.put(new Ball(5.0, Color.RED));
        basket.put(new Ball(1.0, Color.BLUE));

        System.out.println("Weight = " + String.valueOf(basket.countWeight()));
        System.out.println("Number of blue balls is " + String.valueOf(basket.countBallsOfColor(Color.BLUE)));

    }

}
