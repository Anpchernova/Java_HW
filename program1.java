/**
 * program1
 */
public class program1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15));
        System.out.println(isSumBetween10And20(7, 15));
    }
    private static boolean isSumBetween10And20(int a, int b) {
            if ((a + b) >= 10 && (a + b) <= 20){
                return true;
            } else{
                return false;
            }
    }
}