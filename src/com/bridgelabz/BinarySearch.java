package com.bridgelabz;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch
{
    //method  binarySearch
    public int binarySearch(String[] wordList, String searchName)
    {
        int start = 0, length = wordList.length - 1;

        while (start <= length)
        {
            int middle = start + (length - start) / 2;
            int result = searchName.compareTo(wordList[middle]);

            if (result == 0)
                return middle;

            if (result > 0)
                start = middle + 1;
            else
                length = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        BinarySearch Obj = new BinarySearch();

        Scanner scanner = new Scanner(System.in);
        // create array list
        String[] wordList = {"hiii", "Hello", "begin", "to"};
        // array list is ascending order
        Arrays.sort(wordList);
        System.out.println("List of Words :");
        System.out.println(Arrays.toString(wordList));
        System.out.println("Enter the word you want to search");
        String searchName = scanner.nextLine();
        scanner.close();
        int result = Obj.binarySearch(wordList, searchName);

        if (result == -1) //word is found
            System.out.println("word is found at " + "index " + result);
        else
            System.out.println("word is not present in the list");

    }


}