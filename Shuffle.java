package org.ps.practice;
import java.util.Scanner;

public class Shuffle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int ar[] = new int[size];

        System.out.print("Original Array: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        for (int j = ar.length - 1; j > 0; j--) {
            int ind = (int) (Math.random() * (j + 1)); 
            int temp = ar[j];
            ar[j] = ar[ind];
            ar[ind] = temp;
        }

        System.out.println("\nShuffled Array:");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
