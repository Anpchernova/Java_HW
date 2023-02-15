public class program6 {
    public static void main(String[] args) {
        String[] arr = {"aaa", "aab", "aa"};
        System.out.println(findCommonPrefix(arr));
    }
    public static String findCommonPrefix(String[] s) {
        if (s.length == 0) return "";
        
        String prefix = s[0];
        for (int i = 1; i < s.length; i++) {
            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.equals("")) return "";
            }
        }
        return prefix;
    }
}
