package EasyProblems;

import java.util.ArrayList;

public class Running1DSum {
    public static int[] runningSum(int[] nums) {
        int curr;
        int last = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            curr = nums[i];
            res[i] = curr + last;
            last = curr + last;
        }
        return res;
    }
}
