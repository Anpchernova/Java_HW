import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class array2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> myList = new ArrayList<>(10);
        for (int i = 0; i < 20; i++) {
        myList.add(rnd.nextInt(20));
        }
        System.out.println("All List:");
        System.out.println(myList.toString());
        System.out.println("Min element is " + Collections.min(myList));
        System.out.println("Max element is " + Collections.max(myList));
        int sum = 0;
        for (int i : myList) {
            sum+=i;
        }
        System.out.println("Average found is " + sum/(float)myList.size());         
    }
}
