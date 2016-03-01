package lab_21_30.lab22;
// Created by boykodm on 26.02.16.16:23


public class ArrayUtils {
        public static int[][] rotateClockwise(int[][] arg) {
            if (arg == null || arg.length == 0 || arg[0] == null || arg[0].length != arg.length) {
                return arg;
            }else{
                final int w = arg.length;
                final int h = arg[0].length;

                for(int i = 0; i < w; i++){
                    if(arg[i] == null || arg[i].length != h){
                        throw new IllegalArgumentException();
                    }
                }

                int[][] result = new int[h][w];
                // rotate
                for (int i = 0; i < h; ++i) {
                    for (int j = 0; j < w; ++j) {
                        result[i][j] = arg[w - j - 1][i];
                    }
                }

                return result;
            }
        }
    }

