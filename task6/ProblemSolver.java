package task6;

public class ProblemSolver {
    public static double[][] getMatrix(double[] array){
        double[][] result = new double[array.length][array.length];
        int startIndex = 0;
        int index = 0;
        for (int i = 0; i < array.length; ++i){

            for (int j = 0; j < array.length; ++j )
                result[i][j] = array[index++ % array.length];

            startIndex++;
            index = startIndex;
        }
        return result;

    }
}
