import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class array1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> myList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
        myList.add(rnd.nextInt(50));
        }
        System.out.println("All List:");
        System.out.println(myList.toString());
        myList.removeIf(num -> num%2==0);
        Collections.sort(myList);
        System.out.println("Sorted List:");
        System.out.println(myList.toString());
        }
}
