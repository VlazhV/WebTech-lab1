package task4;

public class CheckPrime {
    public static boolean isPrime (int x) throws NumberFormatException {
        if (x <= 0) throw new NumberFormatException("Число не является натуральным!");
        if (x == 1) return false;
        for (int i = 2; i * i <= x; ++i)
            if (x % i == 0) return false;

        return true;
    }
}
