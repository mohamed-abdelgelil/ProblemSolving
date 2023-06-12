package Leetcode;

import java.util.*;

public class TowSum1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 6, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-6, 1, 0, 4}, -5)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1,-2,-3,-4,-5}, -8)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        if (nums.length == 2) {
            result[0] = 0;
            result[1] = 1;
            return result;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }

        int diff = 0;
        for (Integer key : map.keySet()) {
            if (target < 0 && key < 0) {
                diff = (key + Math.abs(target)) * -1;
            }else {
                diff = Math.abs(key - target);
            }

            if (map.containsKey(diff)) {//abs(key - target))) {
                if (map.get(diff).size() == 2) {
                    result[0] = map.get(diff).get(0);
                    result[1] = map.get(diff).get(1);
                } else {
                    result[0] = map.get(key).get(0);
                    result[1] = map.get(diff).get(0);
                }
                return result;
            }
        }
        return result;
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int x = 0; x < nums.length && i != x; x++) {
                if (nums[i] + nums[x] == target) {
                    result[0] = i;
                    result[1] = x;
                }
            }
        }
        return result;
    }
}
