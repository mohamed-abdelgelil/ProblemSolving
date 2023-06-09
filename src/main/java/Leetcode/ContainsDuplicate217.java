package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3,1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for(int i: nums){
            if(!integerSet.add(i)){
                return true;
            }
        }
        return false;
    }
}
