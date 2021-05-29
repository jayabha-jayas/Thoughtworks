package com.company;

import java.util.Scanner;

public class LowerTriangularMatrix {
    public static boolean isLowerTriangular(int[][] square, int n){
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (square[i][j] != 0)
                    return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        if (rows == columns){
            int[][] square = new int[rows][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++)
                    square[i][j] = scanner.nextInt();
            }
            System.out.println(isLowerTriangular(square, rows)? "Yes" : "No");
        } else{
            System.out.println("No");
        }
    }
}
