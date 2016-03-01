package lab_21_30.lab22;
// Created by boykodm on 26.02.16.17:01

public class Test2 {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(new int[0][]);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
