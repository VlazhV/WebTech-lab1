package task9.Ball;


public class Ball {
    protected double weight;
    protected Color color = Color.BLACK;

    public Ball(double weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {return weight;}
    public Color getColor() {return color;}

}
