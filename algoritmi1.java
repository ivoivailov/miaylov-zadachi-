package mihaylov;

import java.util.Dictionary;
import java.util.Hashtable;

public class algoritmi1 {
    public static void main(String[] args) {

        // Реализация на Dictionary ЧРЕЗ HashTable
        //Dictionary предлага наличието на двойки < key : value>


        Dictionary<Integer, String> MyDictionary = new Hashtable<>();

        //         KEY : VALUE

        // Using a few dictionary Class Methods

        // Using put Method
        MyDictionary.put(10,"apple");
        MyDictionary.put(11,"banana");
        MyDictionary.put(12,"orange");
        MyDictionary.put(15,"Avocado");

        //print size of dictionary
        System.out.println("\nSize OF My_Dict :" + MyDictionary.size());

        //using get() method
        System.out.println("Value at key = 10 : " + MyDictionary.get(10));
        System.out.println("Value at key = 11 : " + MyDictionary.get(11));
        System.out.println("Value at key = 12 : " + MyDictionary.get(12));
        System.out.println("Value at key = 15 : " + MyDictionary.get(15));

        System.out.println("Before removing elements :" + MyDictionary);




        System.out.println("\nIs my dictionary empty? :" + MyDictionary.isEmpty() + "\n");


        //using remove() method
        //remove value at key 10
        MyDictionary.remove(10);
        MyDictionary.remove(12);

        System.out.println("checking if the removed value exists : " + MyDictionary.get(10));
        System.out.println("checking if the removed value exists : " + MyDictionary.get(12));

        System.out.println(MyDictionary);

        System.out.println("\nSize of my_dict : " + MyDictionary.size());

    }

}
