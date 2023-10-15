package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String pass="amna";
        int secret=2;
        while(true) {
            System.out.println("Enter the password: ");
            String userchoice=reader.nextLine();
            if (userchoice.equals(pass)) {
                System.out.println("Correct");
                System.out.println("The secret is: " + secret);
                break;
            }
            else {
                System.out.println("Try again.");
            }





        }



    }


}