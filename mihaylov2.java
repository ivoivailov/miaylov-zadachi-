package mihaylov;

import java.util.Scanner;

public class mihaylov2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Input = scanner.nextLine();

        String[] split = Input.split("\\|");
        for (int i = 0; i < split.length; i++) {
            System.out.println("index: " + i + " value: " + split[i]);
        }
        for (int i = split.length; i > 0; i--){
            System.out.print(split[i - 1]);
        }
    }
}
