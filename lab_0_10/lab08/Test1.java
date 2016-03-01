package lab_0_10.lab08;

/**
 * Created by boykodm on 10.02.16.
 */
public class Test1 {

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 1, 0};
        ArrayInverter.invert(array);
        if (array[0] != 0
                || array[1] != 1
                || array[2] != 2
                || array[3] != 3
                || array[4] != 4) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
