package result;

import java.util.*;

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        int[] ans = new int[k];
        int i = 0;
        while (i < k) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            ans[i++] = entry.getKey();
        }
        return ans;
    }
}
