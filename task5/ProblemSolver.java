package task5;

import java.awt.*;
import java.util.ArrayList;

public class ProblemSolver {

        public static int solve (int[] a) {

            int[] d = new int[a.length];

            for (int i = 0; i < a.length; ++i) {
                d[i] = 1;
                for (int j = 0; j < i; ++j)
                    if (a[j] < a[i])
                        d[i] = Math.max(d[i], 1 + d[j]);
            }

            int ans = d[0];
            for (int i = 1; i < a.length; ++i)
                ans = Math.max(ans, d[i]);

            return a.length - ans;
        }

}
