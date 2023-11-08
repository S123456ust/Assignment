package org.ps.practice;



import java.util.Scanner;

public class panagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
        String s= scanner.nextLine();
        s= s.toLowerCase();
        int count = 26;
        String alfabey = "abcdefghijklmnopqrstuvwxyz";

        for (int j = 0; j < alfabey.length(); j++) {
                String symbol = String.valueOf(alfabey.charAt(j));
                if(s.contains(symbol)) {
                    count--;
                }
        }
    if(count>0){
        System.out.println("not pangram");
    } else if (count==0) {
        System.out.println("pangram");
    }

	}

}
