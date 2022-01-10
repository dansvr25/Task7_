package ru.vsu.cs.sviridov_d_v;

import java.util.Arrays;

public class FindMaxSumOfConsecutiveElements {

    public static int findMaxSumOfConsecutiveElements(int[] arr) {

        if (arr.length == 0)
            return 0;

        int max = Arrays.stream(arr).max().getAsInt();

        if (max < 0) {
            return max;
        }

        int maxLast = 0;
        int maxFirst = 0;

        for (int i : arr) {
            maxFirst = maxFirst + i;
            maxFirst = Math.max(maxFirst, 0);
            maxLast = Math.max(maxLast, maxFirst);
        }

        return maxLast;
    }

}