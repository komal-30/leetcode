package dsa.daily.practise.twopointers;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Leetcode_832 {

    // Optimized Logic
    /*
     * 1 2 3
     * n = 3
     * n/2 = 3/2 = 1 , 1 and 3 will be swapped and inverted
     * Here the middle element even if doesnt swap, but has to be inverted
     * that will be missed
     * 
     * (n+1)/2 = 4/2 = 2
     * 1 and 3 will be swapped and inverted
     * 2 with 2 swapped and inverted
     */

    /*
     * XOR Properties
     * number ^ number = 0
     * number ^ 0 = unchanged
     * number ^ 1 = flip bit
     */

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;

        for (int i = 0; i < n; i++) {
            int[] row = image[i];
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = row[j] ^ 1; // left
                row[j] = row[n - 1 - j] ^ 1; // right to left
                row[n - 1 - j] = temp; // left added to right

            }

        }

        return image;

    }

    // Brute Force
    public static int[][] flipAndInvertImage2(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int[] reversedArray = reverse(image[i]);
            int[] replacedArray = replace(reversedArray);
            image[i] = replacedArray;

        }
        return image;

    }

    public static int[] reverse(int[] input) {
        List<Integer> list = IntStream.of(input).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    public static int[] replace(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0)
                input[i] = 1;
            else
                input[i] = 0;
        }

        return input;

    }

    public static void main(String[] args) {

        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };
        int[][] ans = flipAndInvertImage(image);

        for (int[] row : ans) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
