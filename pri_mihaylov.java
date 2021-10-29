package mihaylov;

import java.util.Arrays;

public class pri_mihaylov {
    public static void main(String[] args) {


        int[] arr = {9, 9, 9};

        System.out.println(Arrays.toString(arr));
         upArray(arr);



    }

    private static void upArray(int[] arr) {

    StringBuilder strNum = new StringBuilder();

        for (int num : arr)
        {
            strNum.append(num);
        }
        int finalInt = Integer.parseInt(strNum.toString());
        System.out.println(finalInt + 1);


    }

}


























