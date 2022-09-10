package task8;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double[] a;
        double[] b;
        int n;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Введите длину последовательности n");
            n = scanner.nextInt();
            a = new double[n];
            System.out.println("Введите элементы последовательности a[n]");
            for (int i = 0; i < n; ++i)
                a[i] = Double.parseDouble(scanner.next());

            System.out.println("Введите длину последовательности m");
            n = scanner.nextInt();
            b = new double[n];
            System.out.println("Введите элементы последовательно b[m]");
            for (int i = 0; i < n; ++i)
                b[i] = Double.parseDouble(scanner.next());
        } catch (Exception e){
            System.out.println("Неверный формат");
            return;
        }

        ArrayList<Integer> indexesOfBInNewSequence =  ProblemSolver.GetIndexesOfBInNewSequence(a, b);

        System.out.println();
        for (Integer index : indexesOfBInNewSequence)
            System.out.print(index + " ");





    }
}
