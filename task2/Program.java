package task2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input point coordinates:");

        double x, y;
        try{
            x = Double.parseDouble(scanner.next());
            y = Double.parseDouble(scanner.next());
        }
        catch (Exception e)
        {
            System.out.println("Incorrect format");
            return;
        }
        ProblemSolver problemSolver = new ProblemSolver();
        boolean ifBelongs = problemSolver.ifPointBelongs(x, y);
        System.out.print(ifBelongs);
    }

}
