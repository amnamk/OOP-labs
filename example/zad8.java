package org.example;

public class zad8 {
    public static void main(String[] args) {
        printstars(5);


    }

    public static void printstars(int read) {
        for(int i=0;i<read;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
