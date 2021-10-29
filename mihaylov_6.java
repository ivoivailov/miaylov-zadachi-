package mihaylov;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class mihaylov_6 {
    public static void main(String[] args) {

        ArrayList<Integer> arraySqrt = new ArrayList<>();

        int[] array = {8,27,25,16, 660, 49, 33};


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j <= array[i]/2; j++) {

                if (j * j == array[i]){
                    arraySqrt.add(array[i]);
                }
            }
        }
        arraySqrt.sort(Comparator.reverseOrder());
        System.out.print("Подредени по квадрат: ");
        System.out.println(arraySqrt);
    }
}

