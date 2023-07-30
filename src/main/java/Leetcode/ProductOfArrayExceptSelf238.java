package Leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);
        int curr = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = answer[i] * curr;
            curr = curr * nums[i];
        }
        curr = 1;
        for (int i = nums.length -1; i >=0; i--) {
            answer[i] = answer[i] * curr;
            curr = curr * nums[i];
        }
        return answer;
    }

    public static int[] productExceptSelf3(int[] nums) {
        int[] answer = new int[nums.length];
        int totalProd = 1;
        int zCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                totalProd = totalProd * nums[i];
            } else {
                zCount++;
            }
            if (zCount > 1) {
                return answer;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zCount == 1) {
                if (nums[i] != 0) {
                    answer[i] = 0;
                } else {
                    answer[i] = totalProd;
                }
            } else {
                answer[i] = totalProd / nums[i];
            }
        }

        return answer;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int[] answer = new int[nums.length];

        for (int a = 0; a < nums.length; a++) {
            int i = 0;
            int j = nums.length - 1;
            int res = 1;
            while (i <= j) {
                if (i == j) {
                    res = res * (i == a ? 1 : nums[i]);
                } else {
                    res = res * (i == a ? 1 : nums[i]) * (j == a ? 1 : nums[j]);
                }
                i++;
                --j;
            }

            answer[a] = res;
        }

        return answer;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int res = 1;
            for (int x = 0; x < nums.length; x++) {
                if (i != x) {
                    res = res * nums[x];
                }
            }
            answer[i] = res;
        }
        return answer;
    }
}
