package Leetcode;

public class longestCommonPrefix14 {
    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String subS = "";
        for(int x = strs[0].length(); x >= 0; x--){
            subS = strs[0].substring(0,x);
            int i;
            for(i=1;i < strs.length ; i++){
                if(!strs[i].startsWith(subS)){
                    break;
                }
            }
            if(i == strs.length){
                break;
            }
        }



        return subS;
    }
}