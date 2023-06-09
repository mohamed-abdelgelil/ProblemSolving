package Leetcode;

public class ExcelSheetColumnTitle168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(2));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(706));
        System.out.println(convertToTitle(806));
        System.out.println(convertToTitle(879));
        System.out.println(convertToTitle(52));




    }

    public static String convertToTitle(int columnNumber) {
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        StringBuilder result = new StringBuilder();
        int num = columnNumber;


        while (num > 26){
            result.append(alpha[num % 26 == 0 ? 26 - 1 : num % 26 - 1]);
            num = num % 26 == 0 ?  num / 26 -1 : num / 26;
        }
        result.append(alpha[num - 1]);
        return result.reverse().toString();
    }

}
