package lab_11_20.lab18;
// Created by boykodm on 18.02.16.17:39

public class Test1 {
    public static void main(String[] args) {
        if (Parser.eval("123") != 123) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
