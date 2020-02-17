package com.carambula;


public class Main {

    public static void printer(long[][] arr) {
        for (long[] longs : arr) {
            for (long j : longs) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void transposition(long[][] arr) {
        int m = arr.length;
        long temp;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static long sumOfMaxElems(long[][] arr) {
        long sum = 0;
        int m = arr.length;
        for (long[] row : arr) {
            long max = row[0];
            for (int j = 1; j < m; j++) {
                if (row[j] > max) max = row[j];
            }
            sum += max;
        }
        return sum;
    }

    public static void main(String[] args) {
//	    C = Bt
//      a[i][j] - long
//      Sum of max elem rows
        int m = 5;
        if (m < 1) {
            System.out.println("m must be integer more than 0");
        }
        long[][] matrix = new long[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) Math.tan((i - 1) * j - m); // random for weak
            }
        }
        System.out.println("Matrix:");
        printer(matrix);
        transposition(matrix);
        System.out.println("Transposed matrix:");
        printer(matrix);
        System.out.println("Sum of max elements from each row: " + sumOfMaxElems(matrix));
    }
}
