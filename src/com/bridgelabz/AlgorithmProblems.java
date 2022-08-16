package com.bridgelabz;
import java .util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class AlgorithmProblems
{
    public static void main(String[] args)
    {
        int lowerLimit, upperLimit;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        lowerLimit= num.nextInt();
        System.out.println("Enter upper limit : ");
        upperLimit = num.nextInt();

        AlgorithmProblems range = new AlgorithmProblems();
        System.out.println("The given range of prime number are anagram and palindrome or not? ");
        range.primeRange(lowerLimit,upperLimit);
    }
    public void primeRange(int lower,int upper) {

        for (int i = lower; i <= upper; i++) {
            if (i == 1 || i == 0) {
                continue;
            }
            int flag = 1;

            for (int j = 2; j <= i / 2; j++)
            {
                if (i % j == 0)
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
            {
                palindrome(i);
            }
        }
    }
    public static void palindrome(int number)
    {

        int reverse= 0, remainder;
        int temp = number;
        while (number > 0)
        {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        if (temp == reverse)
        {
            System.out.println(temp);
        }
    }


}

