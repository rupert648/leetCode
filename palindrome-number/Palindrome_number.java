public class Palindrome_number {

    public static void main(String[] args) {
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception e) {
            return;
        }

        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String r = "";
        for (int i = s.length()-1;i >= 0;--i) {
            r += s.charAt(i);
        }
        return r.equals(s);
    }
    
}