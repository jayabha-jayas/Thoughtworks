package com.company;

import java.util.Scanner;

public class FindArrayType {
    static int[] array;
    public static int findArrayType() {
        boolean flagEven = false, flagOdd = false;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] % 2 == 0)
                flagEven = true;
            else
                flagOdd = true;
        }
        return (flagEven && flagOdd)? 3 : (flagOdd) ? 2 : 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int result = findArrayType();
        String typeOfArray = (result == 1)? "Even" : (result == 2)? "Odd" : "Mixed";
        System.out.println("The array is " + typeOfArray);
    }
}
