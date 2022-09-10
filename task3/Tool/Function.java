package task3.Tool;

public class Function {
    double startValue;
    double endValue;
    double step;

    public Function(double a, double b, double h){
        startValue = a;
        endValue = b;
        step = h;
    }

    private boolean isNotOut(double i) {
        return (startValue <= endValue && i <= endValue) || (startValue >= endValue && i >= endValue);
    }

    public double[][] countFunction ()
    {
        int size = (int)Math.round((endValue - startValue) / step);

        if ((endValue - startValue) % step == 0){
            ++size;
        }

        double[][] result = new double[size][2];
        int j = 0;
        for (double i = startValue; isNotOut(i) && j < size; i += step){
            result[j][0] = i;
            result[j++][1] = Math.tan(i);
        }
        return result;
    }


}
