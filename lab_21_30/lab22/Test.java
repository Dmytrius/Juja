package lab_21_30.lab22;
// Created by boykodm on 26.02.16.16:23

public class Test {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(null);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
