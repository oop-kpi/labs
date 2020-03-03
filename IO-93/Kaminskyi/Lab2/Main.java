import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

/**
 C2 = 9314 % 5 = 4 ( С=A*B );
 C3 = 9314 % 3 = 4 ( long );
 C5 = 9314 % 11  = 8 ( Знайти середнє значення елементів кожного рядка матриці );
 **/
public class Main {

    public static void main(String[] args) {

        int an = 0;
        int am = 0;
        int bn = 0;
        int bm = 0;
        long l = 0; //Left random gen border
        long r = 0; //Right random gen border
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter minimal and maximal random number:");
            l = scan.nextLong();
            r = scan.nextLong();
            System.out.println("Enter n and m values for A matrix:");
            an = scan.nextInt(); //A matrix length
            am = scan.nextInt(); //A matrix height
            System.out.println("Enter n and m values for B matrix:");
            bn = scan.nextInt(); //B matrix length
            bm = scan.nextInt(); //B matrix height
        }
        catch (Exception e) {
            System.out.println("You were supposed to enter only numbers, try again");
            return;
        }
        if (am != bn){
            System.out.println("m value of A and n value of B must be equal in order to perform multiplication");
            return;
        }
        long[][] A = new long[an][am];
        long[][] B = new long[bn][bm];
        long[][] C = new long[an][bm];
        MatrixRandomLongFill(A, l, r);
        MatrixRandomLongFill(B, l, r);
        System.out.println("Matrix A:");
        printlongMatrix(A);
        System.out.println("Matrix B:");
        printlongMatrix(B);
        for (int n = 0; n < C.length; n++) { //Matrix multiplication
            for (int m = 0; m < C[n].length; m++){
                for (int k = 0; k < A[n].length; k++){
                    C[n][m] += A[n][k]*B[k][m];
                }
            }
        }
        System.out.println("Matrix C:");
        printlongMatrix(C);
        long[] result = new long[C.length];
        for (int n = 0; n < C.length; n++){
            long elem = 0;
            long count = 0;
            for (int c = 0; c < C[n].length; c++){
                elem += C[n][c];
                count += 1;
            }
            result[n] = elem/count;
        }
        System.out.println("Averages for every row in C matrix:");
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static long randValue(long l, long r) { //Random number generation func
        return ThreadLocalRandom.current().nextLong(l, r);
    }
    public static void MatrixRandomLongFill(long[][] Matr, long l, long r){
        for (int n = 0; n < Matr.length; n++) {
            for (int m = 0; m < Matr[n].length; m++){
                Matr[n][m] = randValue(l, r);
            }
        }
    }
    public static void printlongMatrix(long[][] Matr){
        for (int n = 0; n < Matr.length; n++) {
            for (int m = 0; m < Matr[n].length; m++){
                System.out.print(Matr[n][m] + " ");
            }
            System.out.println();
        }
    }
}
