public class LongestPrefix {

    public static void main(String[] args) {
        

        System.out.println(longestPrefix(args));
    }

    public static String longestPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String longestPrefix = strs[0];

        for (int i = 1; i <strs.length;i++) {
            String newlongest = "";
            int x = 0;
            int y = 0;
            while (x < longestPrefix.length() && y < strs[i].length()) {

                if (longestPrefix.charAt(x) == strs[i].charAt(y)) {
                    newlongest += strs[i].charAt(x);
                } else {
                    break;
                }
                x++;
                y++;

            }

            if (newlongest == "") {return "";};
            longestPrefix = newlongest;
            
        }

        return longestPrefix;
    }
    
}