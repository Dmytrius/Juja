package lab_0_10.lab08;

public class ArrayInverter {
    public static void invert(int[] arr){
        if(arr.length > 2 && arr.length % 2 != 0){
            for(int k = arr.length / 2; k >= 0; k--){
                int tmp = arr[k];
                arr[k] = arr[arr.length - k - 1];
                arr[arr.length - k - 1] = tmp;
            }
        } else if(arr.length == 2){
            int tmp = arr[1];
            arr[1] = arr[0];
            arr[0] = tmp;
        } else if(arr.length > 2 && arr.length % 2 == 0){
            for(int k = arr.length / 2 + 1; k >= 0; k--){
                int tmp = arr[k];
                arr[k] = arr[arr.length - k -1];
                arr[arr.length - k -1] = tmp;
            }

        }
    }
}
