package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements347 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{-1, -1}, 1)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 2}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1 || nums.length == 2 && k == 2) {
            return nums;
        }
        if (nums.length == 2 && k == 1) {
            return new int[]{nums[0]};
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        map = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(k).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return map.keySet().stream().mapToInt(i -> i).toArray();
    }

    public static int[] topKFrequent1(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) >= 2) {
                list.add(key);
            }
        }
        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
