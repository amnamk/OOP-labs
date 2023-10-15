package org.example;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first=reader.nextInt();

        System.out.println("Enter second number: ");
        int second=reader.nextInt();

        if(first>second) {
            System.out.println(" ");
        }
        while(first<=second) {
            System.out.println(first);
            first++;
        }
    }
}
