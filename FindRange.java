package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FindRange {
    static int[] array;
    public static int findRange() {
        Arrays.sort(array);
        return array[array.length-1]-array[0];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The range of the array is " + findRange());
    }
}
