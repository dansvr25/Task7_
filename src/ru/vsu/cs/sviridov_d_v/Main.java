package ru.vsu.cs.sviridov_d_v;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        int[] array = new int[readLengthOfArray()];

        readArray(array);

        System.out.println("Answer: ");
        System.out.println(FindMaxSumOfConsecutiveElements.findMaxSumOfConsecutiveElements(array));

    }

    private static int readLengthOfArray() {
        System.out.print("Enter the length of array: ");
        Scanner scn = new Scanner(System.in);

        int length = scn.nextInt();
        if (length < 0) {
            System.out.println("Error. The length of array can not be less than 0");
            System.out.print("Please, retry");
            length = readLengthOfArray();
        }
        return length;
    }

    private static void readArray(int[] arr) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter %d element of array: ", (i + 1));
            arr[i] = scn.nextInt();
        }
    }

}
