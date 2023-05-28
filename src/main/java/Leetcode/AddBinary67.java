package Leetcode;

public class AddBinary67 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }


    public static String addBinary(String a, String b) {
        int carry = 0;
        int sum = 0;
        int aPointer = a.length() - 1;
        int bPointer = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int achar = 0;
        int bchar = 0;


        while (aPointer >= 0 || bPointer >= 0) {
            achar = aPointer < 0 ? 0 : Integer.parseInt(String.valueOf(a.charAt(aPointer)));
            bchar = bPointer < 0 ? 0 : Integer.parseInt(String.valueOf(b.charAt(bPointer)));

            sum = carry + achar + bchar;

            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            } else if (sum == 2) {
                result.append(0);
                carry = 1;
            } else if (sum == 3) {
                result.append(1);
                carry = 1;
            }
            --aPointer;
            --bPointer;
        }
        if (carry == 1) {
            result.append(carry);
        }
        return result.reverse().toString();
    }


}
