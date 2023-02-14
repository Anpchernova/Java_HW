public class program3 {
    public static void main(String[] args) {
        printString("dog", 5);
    }
    private static void printString(String source, int repeat) {
        int count = 0;
        while (count < repeat) {
            count++;
            System.out.print(source);
        }
    }
}