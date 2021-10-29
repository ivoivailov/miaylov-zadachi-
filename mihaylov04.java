package mihaylov;

public class mihaylov04 {

        public static void main(String[] args) {

            int [] array = {5, 3, 3, 4, 5, 6, 7, 8, 9};

            int max = Integer.MIN_VALUE;

            for(int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            int B[] = new int[max + 1 ];

            for(int i = 0; i < array.length; i++) {
                B[array[i]]++;
            }
            for (int i = 0; i <= max; i++) {
                if (B[i] > 1) {
                    System.out.println(i + "- се повтаря:" + B[i]);
                }
            }
        }
    }


