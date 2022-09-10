package task7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double[] a;
        try{
            System.out.println("Input length of array n");
            n = scanner.nextInt();
            System.out.println("Input elements of array a[n]");
            a = new double[n];
            for (int i = 0; i < n; ++i)
                a[i] = Double.parseDouble(scanner.next());
        } catch( Exception e){
            System.out.println("Incorrect format");
            return;
        }

        double[] sortedArray = ShellSort.sort(a);

        for (double elem : sortedArray)
            System.out.print(elem + " ");

    }
}
