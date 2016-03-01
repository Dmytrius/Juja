package lab_11_20.lab20;
// Created by boykodm on 24.02.16.16:21
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test {

    public static void main(String[] args) {

        String actual = executePermutationsAndReturnOutput();
        String expected = "[1]";

        if (!expected.equalsIgnoreCase(actual)) {
            throw new AssertionError("Expected " + expected + " but was " + actual);
        }

        System.out.print("OK");
    }

    private static String executePermutationsAndReturnOutput() {
        PrintStream systemOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream wrappedStream = new PrintStream(outputStream);
        System.setOut(wrappedStream);

        Permutator.permutation(new int[] {1}, 1);

        System.setOut(systemOut);

        return new String(outputStream.toByteArray()).trim();
    }

}

