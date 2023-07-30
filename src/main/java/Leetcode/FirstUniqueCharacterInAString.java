package Leetcode;

import java.util.*;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chs = s.toCharArray();
        for(char ch: chs){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Character ss: map.keySet()){
            if(map.get(ss) == 1){
                return  s.indexOf(ss);
            }
        }
        return -1;

    }
}
