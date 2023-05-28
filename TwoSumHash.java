package DataStructureX.Algorthims;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHash {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {2,7,11,15};
        System.out.println(Arrays.toString(solution.twoSum(num, 9)));
    }
    public static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[] { i, map.get(complement) };
                }
            }
            /*
            HashMap<Integer, Integer> sum = new HashMap<>();
            for(int j = 0; j < nums.length; j++){
                sum.put(j,nums[j]);
            }
            for(int i = 0; i < nums.length; i++){
                int n = target - nums[i];
                if(sum.containsKey(n) && sum.get(n)!=i){
                    return new int[]{i,sum.get(n)};
                }

            }
            return null;
        }
            /*
            HashMap<Integer, Integer> sum = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                Integer integer = sum.get(nums[i]);
                if(integer != null){
                    return new int[]{integer,i};
                }
                sum.put(target - nums[i],i);
            }
            return nums;
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

         */
            return null;
    }}
}
