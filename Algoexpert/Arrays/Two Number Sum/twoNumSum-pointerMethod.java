//twonumsum - two pointer method
//Complexity: Time - O(NLogN) | Space - O(1)

import java.util.*;
class Solution {

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int leftp = 0, current;
        int rightp = nums.length-1;
        while(leftp < rightp)
        {
            current = nums[leftp] + nums[rightp];
            if(current == target)
                return new int[] {nums[leftp], nums[rightp]};
            else if(current < target)
                leftp++;
            else
                rightp--;
        }
        return new int[0];
    }
}