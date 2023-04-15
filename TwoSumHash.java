package DataStructureX.Algorthims;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHash {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {2,7,11,15};
        System.out.println(Arrays.toString(solution.twoSum(num, 6)));
    }
    public static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> sum = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                sum.put(i,nums[i]);
                int n = target - nums[i];
                if(sum.containsValue(n)){
                    return new int[]{n,i};
                }

            }
            return null;
        }
        /*
         HashMap<Integer, Integer> sum = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                sum.put(i,nums[i]);
                int n = target - nums[i];
                if(sum.containsValue(n)){
                    return new int[]{n,i};
                }

            }
            return null;
         */
    }
}