package Leetcode;

import java.util.*;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram1("anagram", "nagaram"));
        System.out.println(isAnagram1("rat", "car"));

//        System.out.println(isAnagram("anagram", "nagaram"));
//        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram2(String s, String t) {
        List<String> list = new ArrayList<>();
        list.add("s");
        list.indexOf("a");
        return false;
    }
    public static boolean isAnagram1(String s, String t) {
        if(s.length()!= t.length())return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return String.valueOf(sChars).equals(String.valueOf(tChars));
    }
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.get(c) == null){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }

        for(char cc: t.toCharArray()){
            if(map.get(cc)== null){
                return false;
            }else{
                map.put(cc, map.get(cc) - 1);
            }
        }

        for(Integer i: map.values()){
            if(i > 0){
                return false;
            }
        }
        return true;
    }
}
