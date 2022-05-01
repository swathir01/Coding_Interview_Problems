//TWO NUM SUM - HASHTABLE METHOD
//Complexity: Time - O(N) | Space - O(N)

class Solution {

	// return indices of the two numbers such that they add up to target
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> exists = new HashMap<Integer,Integer>(); //<Integer,Boolean>
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(exists.containsKey(diff))
            {
              return new int[] {exists.get(diff), i}; //return new  int[]{diff,nums[i]};
            }
            else
            {
               exists.put(nums[i], i);//exists.put(nums[i],true);
            }
                
        }
        return new int[] {-1,-1};
    }
}