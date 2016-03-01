package lab_0_10.lab06;

/**
 * Created by boykodm on 11.02.16.
 */
public class IntegerUtils {
    public static int rightShift(int arg) {
        /*BODY*/
        return (arg >>> 1 ) | (arg <<31);
    }
}
