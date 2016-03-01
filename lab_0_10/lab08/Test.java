package lab_0_10.lab08;
public class Test {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 0};
        ArrayInverter.invert(array);
        if (array[0] != 0
                || array[1] != 1
                || array[2] != 2
                || array[3] != 3) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}