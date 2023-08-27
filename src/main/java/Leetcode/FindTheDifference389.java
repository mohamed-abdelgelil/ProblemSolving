package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
        System.out.println(findTheDifference("","y"));
        System.out.println(findTheDifference("a","aa"));
    }
    public static char findTheDifference(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char ch: s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0) +1);
        }
        for(char ch: t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0) +1);
        }

        if(map1.size()> map2.size()){
            for(Map.Entry<Character,Integer> entry: map1.entrySet()) {
                if (!entry.getValue().equals(map2.get(entry.getKey()))) {
                    return entry.getKey();
                }
            }
        }else{
            for(Map.Entry<Character,Integer> entry: map2.entrySet()) {
                if (!entry.getValue().equals(map1.get(entry.getKey()))) {
                    return entry.getKey();
                }
            }
            }



        //Comparator
        //Stream & Foreach
        //XOR

        return ' ';

    }
}
