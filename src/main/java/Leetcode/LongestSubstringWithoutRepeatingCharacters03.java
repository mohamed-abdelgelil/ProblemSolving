package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters03 {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring("aab"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> characterSet = new HashSet<>();
        char[] chars = s.toCharArray();
        int length = 0;
        int start = 0;
        for(int i=start;i<chars.length;i++){
            if(!characterSet.add(chars[i])){
                if(characterSet.size() > length){
                    length = characterSet.size();
                }
                characterSet = new HashSet<>();
                start++;
                i=start;
                characterSet.add(chars[i]);
            }
        }
        if(characterSet.size() > length){
            length = characterSet.size();
        }
        return length;
    }
    public static int lengthOfLongestSubstring1(String s) {

        String longest;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] chs = s.toCharArray();
        for(int x=0;x<chs.length-1;x++){
            sb.append(chs[x]);
            if(sb.indexOf(String.valueOf(chs[x+1])) != -1){
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        longest = list.get(0);
        for (int i=1;i< list.size();i++){
            if(list.get(i).length() > longest.length()){
                longest = list.get(i);
            }
        }
        return longest.length();
    }
}
