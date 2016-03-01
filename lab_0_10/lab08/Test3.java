package lab_0_10.lab08;

/**
 * Created by boykodm on 10.02.16.
 */
public class Test3 {

    public static void main(String[] args) {
        int[] array = {1, 0};
        ArrayInverter.invert(array);
        if (array[0] != 0 && array[1] != 1) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
