package task6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double[] array;
        try{
            System.out.println("input length of array n");
            n = scanner.nextInt();
            array = new double[n];
            System.out.println("input elements of array");
            for (int i = 0; i < n; ++i)
                array[i] = Double.parseDouble(scanner.next());
        } catch (Exception e) {
            System.out.println("incorrect format");
            return;
        }

        double[][] matrix = ProblemSolver.getMatrix(array);

        for (int i = 0; i < n; ++i){
            for (int j = 0; j < n; ++j)
                System.out.print(String.valueOf(matrix[i][j]) + " ");
            System.out.println();
        }
    }
}
