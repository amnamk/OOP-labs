package org.example;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int sum=0;
        while (true) {
            System.out.println("Enter a number: ");
            int read= reader.nextInt();
            if(read==0) {
                break;
            }
            sum=sum+read;
            System.out.println("Sum now is: "+ sum);

        }
        System.out.println("Sum at the end is: "+ sum);




    }
}
