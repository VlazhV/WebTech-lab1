package task4;

import java.util.Scanner;

public class Program {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] arr;
        try{
            System.out.println("Введите размер массива N");
            n = scanner.nextInt();
            arr = new int[n];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; ++i)
                arr[i] = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Неверный формат");
            return;
        }

        boolean noPrime = true;

            for (int i = 0; i < n; ++i) {
                try {
                    if (CheckPrime.isPrime(arr[i])) {
                        System.out.print("[" + String.valueOf(i) + "] ");
                        noPrime = false;
                    }
                }catch(NumberFormatException e){}
            }


        if (noPrime) System.out.println("No prime ints");

    }
}
