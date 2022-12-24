package EasyProblems;

import java.util.Arrays;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++){
                int a = nums[i] + nums[j];
                if (a == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[1];
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int targ = 6;
        System.out.println(Arrays.toString(twoSum(nums, targ)));
    }
}

