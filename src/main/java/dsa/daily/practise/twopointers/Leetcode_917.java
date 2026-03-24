package dsa.daily.practise.twopointers;

public class Leetcode_917 {

    public static String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] charArray = s.toCharArray();
        while (start < end) {
            if (Character.isAlphabetic(charArray[start]) && Character.isAlphabetic(charArray[end])) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;

                start++;
                end--;

            } else if (!Character.isAlphabetic(charArray[start])) {
                start++;

            } else
                end--;
        }

        return new String(charArray);

    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));

    }

}
