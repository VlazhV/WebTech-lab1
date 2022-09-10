package task2;

import task2.Data.MarkedSpace;

import java.awt.*;

public class ProblemSolver {
    MarkedSpace markedSpace = new MarkedSpace();

    public boolean ifPointBelongs(double x, double y)
    {
        Rectangle[] space = markedSpace.getSpace();
        for (Rectangle rectangle : space) {
            if (rectangle.contains(x, y))
                return true;
        }

        return false;
    }

}
