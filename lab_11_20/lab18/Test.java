package lab_11_20.lab18;
// Created by boykodm on 18.02.16.17:10

public class Test {
    public static void main(String[] args) {
        if (Parser.eval("(123+321)-1") != 443) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
