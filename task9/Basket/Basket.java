package task9.Basket;

import task9.Ball.Ball;
import task9.Ball.Color;

public class Basket <T extends Ball> {
    private Node<T> head = new Node<T>();

    public Basket(){
        head.item = null;
        head.nextNode = null;
    }

    public void put(T t) {
        Node temp = head.nextNode;
        head.nextNode = new Node<T>();
        head.nextNode.item = t;
        head.nextNode.nextNode = temp;
    }

    public double countWeight(){
        Node node = head.nextNode;
        double sumWeight = 0;
        while (node != null){
            sumWeight += node.item.getWeight();
            node = node.nextNode;
        }
        return sumWeight;
    }

    public int countBallsOfColor(Color color){
        Node node = head.nextNode;
        int nBalls = 0;
        while (node != null){
            if (node.item.getColor() == Color.BLUE)
                ++nBalls;
            node = node.nextNode;
        }
        return nBalls;
    }

}
