package lab_11_20.lab11;

// Created by boykodm on 11.02.16.11:36
public class MathUtils {
    public static int lookFor(int max) {
        int midle = max / 2;
        int base = 1;
        int counter = 0;

        for ( int i = midle; i > 0; i-- ) {
            if ( i * i <= max ) {
                base = i;
                i = 0;
            }
        }

        for ( int i = 1; i <= base; i++ ) {
            for ( int j = 1, k = i * i; j <= base; j++ ) {
                if ( (k + j * j)  <= max ) {
                    counter += 1;
                }
            }
        }

        return counter;
    }

}
