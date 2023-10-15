package org.example;

public class zad9 {
    public static void main(String[] args) {
        printstars(5);


    }

    public static void printstars(int read) {
        for(int i=1;i<=read;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
