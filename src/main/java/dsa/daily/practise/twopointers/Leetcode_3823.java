package dsa.daily.practise.twopointers;

public class Leetcode_3823 {

    public String reverseByType(String s) {
        char[] arr = s.toCharArray();

        // reverse letters
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (!Character.isLetter(arr[l]))
                l++;
            else if (!Character.isLetter(arr[r]))
                r--;
            else {
                char temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp;
            }
        }

        // reverse special characters
        l = 0;
        r = arr.length - 1;
        while (l < r) {
            if (Character.isLetter(arr[l]))
                l++;
            else if (Character.isLetter(arr[r]))
                r--;
            else {
                char temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp;
            }
        }

        return new String(arr);
    }
}