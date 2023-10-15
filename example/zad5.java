package org.example;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = reader.nextInt();

        double sum = 0;

        for (int i = 0; i <= n; i++) {
            double term = Math.pow(2, i);
            sum += term;
        }

        int result = (int) sum; // Convert the double sum to an int

        System.out.println("The sum is: " + result);


    }
}
