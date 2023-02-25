import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        List<String> list = new LinkedList<String>();
        String name = iScanner.nextLine();
        String[] split = name.split("~");
        String word = split[0];
        String numberString = split[1];
        int num = Integer.parseInt(numberString);
        list.add(num,word);
        if(word.toLowerCase().equals("print")){
            System.out.println(list.get(num));
            list.remove(num);
        }
        iScanner.close();
    }
}
