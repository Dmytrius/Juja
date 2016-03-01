package lab_0_10.lab05;

/**
 * Created by boykodm on 11.02.16.
 */
public class IntegerUtils {
    public static int leftShift(int arg) {
        /*BODY*/
        return (arg  >>> 31)|(arg << 1);
    }
}
