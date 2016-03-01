package lab_0_10.lab07;

/**
 * Created by boykodm on 11.02.16.
 */
public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {
        byte mask1 = (byte) (1 << i);
        byte mask2 = (byte) (1 << j);

        byte result = b;

        if ((b & mask1) != 0) {
            result |= mask2;


        } else {
            result &= ~mask2;
        }


        if ((b & mask2) != 0) {
            result |= mask1;
        } else  {
            result &= ~mask1;
        }

        return result;
    }
}
