package task5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] a;
        try{
            System.out.println("Input length of array n");
            n = scanner.nextInt();
            System.out.println("Input elements of array a[n]");
            a = new int[n];
            for (int i = 0; i < n; ++i)
                a[i] = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Incorrect format");
            return;
        }

        System.out.println(ProblemSolver.solve(a));

    }
}
