package task7;

public class ShellSort {
    public static double[] sort(double[] array){

        if (array[0] > array[1]){
            double temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }

        int index = 1;

        while (index < array.length - 1){
            if (array[index] <= array[index + 1])
                ++index;
            else {
                double temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
                --index;
            }
        }

        return array;
    }
}
