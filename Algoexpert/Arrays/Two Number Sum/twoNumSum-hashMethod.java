//TWO NUM SUM - HASHTABLE METHOD
//Complexity: Time - O(N) | Space - O(N)

class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Boolean> exists = new HashMap<Integer, Boolean>(); 
        for(int num: nums)
        {
            int diff = target - num;
            if(exists.containsKey(diff))
            {
              return new int[] {diff, num};
            }
            else
            {
               exists.put(num, true);
            }       
        }
        return new int[0];
    }
}