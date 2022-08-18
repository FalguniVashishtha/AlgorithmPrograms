package com.bridgelabz;
import java .util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class AlgorithmProblems
{
    public static Scanner sc = new Scanner(System.in);
    public void findNumber(int low, int high)
    {

        if(low == high) {
            System.out.println("Your Number is : "+low);
            System.out.println("Intermediatory Number is: "+(low-1)+" and "+(low+1));
            return;
        }

        int middle = (low+high)/2;
        int choice;
        System.out.println("Press 1 if the number is between : "+low+" and "+middle);
        System.out.println("Press 2 if the number is between : "+(middle+1)+" and "+high);
        choice = sc.nextInt();

        if(choice == 1) {
            findNumber(low, middle);
        }
        else {
            findNumber(middle+1, high);
        }
    }

    public static void main(String[] args)
    {

        AlgorithmProblems obj = new AlgorithmProblems();
        System.out.println("Think of a number between 0 and 100");
        int N = Integer.parseInt(args[0]);
        obj.findNumber(1, N);
        sc.close();

    }

}

