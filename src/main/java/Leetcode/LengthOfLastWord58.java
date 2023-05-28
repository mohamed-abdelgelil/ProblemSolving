package Leetcode;

public class LengthOfLastWord58 {
    public static int lengthOfLastWord(String s) {
        int charCount = 0;
        for(int i = s.length()-1; i>=0;i--){
            if(s.charAt(i) != ' '){
                charCount++;
            }else if(charCount > 0){
                return charCount;
            }
        }
        System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        return charCount;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

}
