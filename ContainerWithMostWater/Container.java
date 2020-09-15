import java.util.ArrayList;
import java.lang.Math;
import java.util.*;

public class Container {
    
    public static void main(String[] args) {
        int[] n;

        try {
            n = Arrays.asList(args).stream().mapToInt(Integer::parseInt).toArray();
        } catch (Exception e) {
            return;
        }

        System.out.println(mostwater(n));
    }

    public static int mostwater(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
        return area;
    }
}