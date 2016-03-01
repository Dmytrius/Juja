package lab_21_30.lab22;
// Created by boykodm on 26.02.16.16:50
import java.util.Arrays;
public class Test1 {
    public static void main(String[] args) {
        int[][] oldArray = {{1}};
        int[][] newExpectedArray = {{1}};
        int[][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
