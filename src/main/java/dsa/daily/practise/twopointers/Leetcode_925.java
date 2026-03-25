package dsa.daily.practise.twopointers;

public class Leetcode_925 {

    public static boolean isLongPressedName(String name, String typed) {

        int typePointer = 0;
        int namePointer = 0;

        while (typePointer < typed.length()) {
            if (namePointer < name.length() && name.charAt(namePointer) == typed.charAt(typePointer)) {
                namePointer++;
                typePointer++;
            } else if (typePointer - 1 >= 0 && typed.charAt(typePointer) == typed.charAt(typePointer - 1))
                typePointer++;
            else
                return false;

        }

        return namePointer == name.length();

    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("saeed", "ssaaedd"));

    }

}
