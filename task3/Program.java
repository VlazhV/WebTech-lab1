package task3;

import task3.Tool.Function;
import task3.View.TableManager;

import java.util.Scanner;

public class Program {
    public static void main(String[] agrs)
    {
        TableManager tableManager = new TableManager('|', "x", "F(x)");

        Scanner scanner = new Scanner(System.in);
        double a, b, h;
        try {
            System.out.println("input start value a:");
            a = Double.parseDouble(scanner.nextLine());
            System.out.println("input end value b:");
            b  = Double.parseDouble(scanner.nextLine());
            System.out.println("input step h:");
            h  = Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Incorrect format");
            return;
        }

        Function function = new Function(a, b, h);
        double[][] argsFunction = function.countFunction();

        tableManager.addLines(argsFunction);

        System.out.print(tableManager.getTable());

    }
}
