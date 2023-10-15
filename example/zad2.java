package org.example;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<3;i++) {
            System.out.println("Enter a number: ");
            int read=reader.nextInt();
            sum=sum+read;

        }
        System.out.println("Sum is: "+ sum);




    }
}
