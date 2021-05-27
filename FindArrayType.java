package com.company;

import java.util.Scanner;

public class FindArrayType {
    static int[] array;
    public static int findArrayType() {
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        if (evenCount == array.length) return 1;
        else if(oddCount == array.length) return 2;
        else return 3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int result = findArrayType();
        if (result == 1) System.out.println("The array is Even");
        else if (result == 2) System.out.println("The array is Odd");
        else System.out.println("The array is Mixed");
    }
}
