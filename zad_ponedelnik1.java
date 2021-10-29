package mihaylov;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zad_ponedelnik1 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList<String> MyList = new ArrayList<>();
        String answer = "";

        while (!answer.contains("end")){

            System.out.println("Please choose <add> <rem> <prn> <end> :  ");
            answer = Input.next();

            if(answer.contains("add")){
                System.out.println("Input name: ");
                String name = Input.next();
                 MyList.add(name);

            }

            if(answer.contains("rem")){
                System.out.println("input number : ");

                //TODO chek if the number is in range
                int number = Input.nextInt();
                MyList.remove(number-1);
            }

            if(answer.contains("prn")){
                System.out.println("List is:");
                System.out.println(MyList);
            }
        }
        System.out.println("Good bye!");

    } //End of the main

} //end of the Class



