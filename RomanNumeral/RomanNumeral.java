import java.util.HashMap; // import the HashMap class

public class RomanNumeral {
    public static void main(String[] args) {
        String arg;
        try {
            arg = args[0];
        } catch(Exception e) {
            return;
        }

        System.out.println(romanToInt(arg));
    }

    public static int romanToInt(String s) {

        int result = 0;
        HashMap<Character, Integer> numerals = new HashMap<Character, Integer>();
        numerals.put('I', 1);numerals.put('V', 5);numerals.put('X', 10);
        numerals.put('L', 50);numerals.put('C', 100);numerals.put('D', 500);
        numerals.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i != s.length()-1) {
                if (s.charAt(i) == 'I') {
                    if (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X') {
                        result = result +( numerals.get(s.charAt(i+1)) - numerals.get(s.charAt(i)));
                        i++;
                        continue;
                    }
                } else if (s.charAt(i) == 'X') {
                    if (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C') {
                        result = result + (numerals.get(s.charAt(i+1)) - numerals.get(s.charAt(i)));
                        i++;
                        continue;
                    }
                }  else if (s.charAt(i) == 'C') {
                    if (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M') {
                        result = result + (numerals.get(s.charAt(i+1)) - numerals.get(s.charAt(i)));
                        i++;
                        continue;
                    }
                }
            } 
            result += numerals.get(s.charAt(i)); 
        }
        return result;
    }
}