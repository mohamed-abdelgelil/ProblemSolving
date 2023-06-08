package Leetcode;

public class IsPalindrome125 {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("a.b,."));
//        System.out.println(isPalindrome("\"Marge, let's \\\"[went].\\\" I await {news} telegram.\""));
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome(" "));

        System.out.println(isPalindrome1("a.b,."));
        System.out.println(isPalindrome1("\"Marge, let's \\\"[went].\\\" I await {news} telegram.\""));
        System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome1("race a car"));
        System.out.println(isPalindrome1(" "));
    }
    public static boolean isPalindrome1(String s) {
        int head=0,tail = s.length()-1;

        while(head <= tail){
            if(!Character.isLetterOrDigit(s.charAt(head))){
                head++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(tail))){
                tail--;
            }
            else{
                if(Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))){

                    return false;
                }
                head++;
                tail--;
            }


        }

        return true;
    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) {
            return true;
        }
        return false;
    }
}
