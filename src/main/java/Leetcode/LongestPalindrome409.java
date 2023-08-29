package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
    }
    public static int longestPalindrome(String s) {
        int length = 0 ;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int addedVal =0 ;
            if(entry.getValue() % 2 == 0){
                addedVal = entry.getValue();
            }else {
                addedVal = entry.getValue() - 1;
            }
            length = length + addedVal;
        }
        if(length < s.length()){
            length++;
        }

        return length;
    }
}
