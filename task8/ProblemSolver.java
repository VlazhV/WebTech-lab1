package task8;

import java.util.ArrayList;

public class ProblemSolver {
    public static ArrayList<Integer> GetIndexesOfBInNewSequence(double[] sequenceA, double[] sequenceB){
        int length = sequenceA.length + sequenceB.length;

        ArrayList<Integer> indexesOfB = new ArrayList<>();
        int indexA = 0, indexB = 0;
        for (int i = 0; i < length; ++i){
            if (indexB >= sequenceB.length){
                indexA++;
                continue;
            }

            if (indexA >= sequenceA.length){
                indexB++;
                indexesOfB.add(i);
                continue;
            }

            if (sequenceB[indexB] <= sequenceA[indexA]){
                indexB++;
                indexesOfB.add(i);
            }
            else{
                indexA++;
            }
        }


        return indexesOfB;

    }
}
