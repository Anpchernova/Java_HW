public class program4 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0  && year % 100 > 0 ){
            return true;
        } else{
            return false;
        }
    }
}
