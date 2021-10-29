package mihaylov;

import java.util.ArrayList;
import java.util.List;

public class mihaylov_5 {

    static ArrayList<Integer> colMaxSum(int a[][]) {
        int idx = -1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
            }
            if (maxSum < sum) {
                maxSum = sum;
                idx = i;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(idx);
        res.add(maxSum);

        return res;
    }



    public static void main(String[] args) {

        int[][] a = {
                {3, 5, 5, 5},
                {4, 5, 2, 5},
                {1, 6, 8, 5},
                {4, 8, 4, 2}
        };


        for (int i = 0; i < a.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < a[0].length; j++) {
                sumRow = sumRow + a[i][j];

            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }
        ArrayList<Integer> ans = colMaxSum(a);
        System.out.println("Row "+ (ans.get(0)+1)+ " has max sum: " + ans.get(1));



    }
}







