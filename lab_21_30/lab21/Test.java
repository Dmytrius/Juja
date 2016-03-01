package lab_21_30.lab21;
// Created by boykodm on 26.02.16.16:17

public class Test {
    public static void main(String[] args) {
        int[][] a = {{10}};
        int[][] b = {{100}};
        int[][] c = MatrixUtils.mul(a, b);

        if (c.length != 1) {
            throw new AssertionError();
        }
        if (c[0].length != 1) {
            throw new AssertionError();
        }
        if (c[0][0] != a[0][0] * b[0][0]) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
