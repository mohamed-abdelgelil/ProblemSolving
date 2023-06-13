package Leetcode;

import java.util.*;

public class GroupAnagrams49 {


    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            List<String> strsList = new ArrayList<>();
            strsList.add(strs[0]);

            return new ArrayList<List<String>>(Collections.singleton(new ArrayList<String>(strsList)));
        }
        Map<String, List<String>> map = new HashMap<>();
        List<String> tempStrs = null;
        for (int i = 0; i < strs.length; i++) {
            char[] strsChars = strs[i].toCharArray();
            Arrays.sort(strsChars);
            if (map.containsKey(String.valueOf(strsChars))) {
                map.get(String.valueOf(strsChars)).add(strs[i]);
            }else {
                tempStrs = new ArrayList<>();
                tempStrs.add(strs[i]);
                map.put(String.valueOf(strsChars), tempStrs);
            }

        }
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagrams1(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        if (strs.length == 1) {
            List<String> strsList = new ArrayList<>();
            strsList.add(strs[0]);
            result.add(strsList);
            return result;
        }

        Map<String, List<String>> map = new HashMap<>();
        char[] strsChars = null;

        List<String> tempStrs = null;

        for (int i = 0; i < strs.length; i++) {
            tempStrs = null;
            strsChars = strs[i].toCharArray();
            Arrays.sort(strsChars);
            if (map.containsKey(String.valueOf(strsChars))) {
                tempStrs = map.get(String.valueOf(strsChars));
            } else {
                tempStrs = new ArrayList<>();
            }
            tempStrs.add(strs[i]);
            map.put(String.valueOf(strsChars), tempStrs);

        }

        for (String mapKeys : map.keySet()) {
            List<String> strsList = new ArrayList<>();
            strsList.addAll(map.get(mapKeys));
            result.add(strsList);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams(new String[]{"a"}));
    }
}
