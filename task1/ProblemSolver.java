package task1;

public class ProblemSolver {
    public double solveProblem(double x, double y)
    {
        double numerator =  Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - 2 * x / (1 + Math.pow(x * y, 2)));
        return  numerator / denominator + x;
    }

}
