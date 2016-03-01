package lab_0_10.lab10;

/**
 * Created by boykodm on 16.02.16.
 */
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] result = Merger.merge(new int[]{2}, new int[]{1, 3});

        if (!Arrays.equals(result, new int[]{1, 2, 3})) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}