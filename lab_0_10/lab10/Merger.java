package lab_0_10.lab10;

/**
 * Created by boykodm on 11.02.16.
 */
public class Merger {
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        if (fst == null || fst.length == 0) {
            return result = snd;
        }
        if (snd == null || snd.length == 0) {
            return result = fst;
        }
        for(int index = 0; index < result.length; index++){
            result[index] = fst[fstIndex] < snd[sndIndex] ? fst[fstIndex++] : snd[sndIndex++];
            if (fstIndex == fst.length) {
                System.arraycopy(snd, sndIndex, result, ++index, snd.length - sndIndex);
                break;
            }
            if (sndIndex == snd.length) {
                System.arraycopy(fst, fstIndex, result, ++index, fst.length - fstIndex);
                break;
            }
        }

        return result;
    }

}
