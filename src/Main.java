/*
Question : Write a program to check given string is palindrome or not.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Letter,OppositeLetter = "";
        int initialization;
        System.out.println("Enter the word.");
        Letter = sc.nextLine();
        for (initialization = Letter.length() - 1; initialization >= 0; initialization--){
            OppositeLetter += Letter.charAt(initialization);
        }
        if (OppositeLetter.equals(Letter)){
            System.out.println("Given word is palindrome :");
        }else
            System.out.println("Given word is not palindrome :");
    }
}