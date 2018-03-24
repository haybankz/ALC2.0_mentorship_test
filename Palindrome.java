package com.haybankz;

import java.util.Scanner;

public class Palindrome {

    // method to check if a string is palindrome
    private static Boolean isPalindrome(String s) {

        // convert string parameter to lower case to ensure strings in capital
        // letters can still be palindrome e.g Madam
        s = s.toLowerCase();

        // if length of string is 0 or 1, string is a palindrome
        if (s.length() == 0 || s.length() == 1)
            return true;


        /* Check if first and last char of the string are the same;
        * if true then do the same thing for a substring with the first and last char removed
        * continue with this until the string completes or condition fails
        * Note, this is known as recursion: function calling itself
        * */
        if ( s.charAt(0) ==  s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));


        /*Program control only reaches this statement if the recursion condition fails
        * meaning that the string is not a palindrome*/
        return false;
    }

    public static void main(String[] args) {

        // capturing the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word for checking: ");
        String word = scanner.nextLine();


        // passing user input to the isPalindrome function for checking
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        }
        else {
            System.out.println(word + " is not a palindrome");
        }
    }


}
