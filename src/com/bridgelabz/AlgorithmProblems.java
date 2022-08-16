package com.bridgelabz;
import java .util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class AlgorithmProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words to check for anagram.");
        String str1 = sc.next();
        String str2 = sc.next();

        //converting to lower case

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // check if length is same
        if(str1.length() == str2.length()) {
            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            /* if sorted char arrays are same
             then the string is Anagram */
            boolean result = Arrays.equals(charArray1, charArray2);
            if(result)
            {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }

}

