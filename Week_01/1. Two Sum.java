package result;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int a = target - nums[i];
            if(map.containsKey(a)&&i!=map.get(a)){
                return new int[] {i,map.get(a)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}