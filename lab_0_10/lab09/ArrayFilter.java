package lab_0_10.lab09;

/**
 * Created by boykodm on 11.02.16.
 */
public class ArrayFilter {
    public static int [] filterEven(int [] nums){
        for (int i =0; i< nums.length; i++) {
            if(nums[i] % 2 ==1){
                nums[i] = 0;
            }
        }

        for(int i = nums.length-1; i>0; i--){
            if(nums[i-1] == 0){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
        }

        return nums;
    }
}
