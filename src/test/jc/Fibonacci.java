package test.jc;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Fibonacci sequence: ");
        int n = input.nextInt();

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}