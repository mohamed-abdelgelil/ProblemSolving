package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt13 {


    public static void main(java.lang.String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("IVCIV"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MDCXCV"));

    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int sum =0;

        while(s.length()>0){
            int subLen=1;
            if(s.length()>1){
                subLen=2;
            }
            if(map.get(s.substring(0,subLen))== null){
                subLen= subLen - 1;
            }
            sum+=map.get(s.substring(0,subLen));
            s = s.substring(subLen);
        }

        return sum;

    }
}
