

public class ReverseInteger {
    public static void main(String[] args) {
        int input_int = Integer.parseInt(args[0]);

        System.out.println(reverse(input_int));
    }

    public static int reverse(int x) {

        String forward_string;
        try {
            forward_string = Integer.toString(x);
        } catch(Exception e) {
            System.out.println("Conversion failed");
            return 0;
        }

        boolean is_negative = forward_string.charAt(0) == '-';
        String new_string = "";
        for (int i = forward_string.length()-1;i>=(is_negative?1:0);--i) {
            new_string += forward_string.charAt(i);
        }

        if (is_negative) {
            new_string = '-' + new_string;
        }

        int r;
        try {
            r = Integer.parseInt(new_string);
        } catch (Exception e) {
            //integer greater than 2^32-1
            return 0;
        }


        return r;
    }
}