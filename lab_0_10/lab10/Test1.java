package lab_0_10.lab10;
import java.util.Arrays;
/**
 * Created by boykodm on 16.02.16.
 */
public class Test1 {
    public static void main(String[] args) {
        int[] result = Merger.merge(new int[]{1}, new int[]{2});

        if (!Arrays.equals(result, new int[]{1, 2})) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
