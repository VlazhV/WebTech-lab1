package task1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input x:");
        double x;
        double y;
        try {
            x = Double.parseDouble(scanner.nextLine());
            System.out.println("input y:");
            y = Double.parseDouble(scanner.nextLine());

        }
        catch (Exception e)
        {
            System.out.println("Incorrect format");
            return;
        }

        ProblemSolver problemSolver = new ProblemSolver();

        double result = problemSolver.solveProblem(x, y);

        System.out.println(result);
    }

}
