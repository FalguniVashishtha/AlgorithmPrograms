package com.bridgelabz;

import java.util.Scanner;
public class BinarySearch <K extends Comparable<K>> {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String sentence = "Search the word";
        String[] arrayOfString = sentence.toLowerCase().split(" ");

        BinarySearch<String> binary = new BinarySearch<>();

        for (int i = 0; i < arrayOfString.length - 1; i++) {
            for (int j = i + 1; j < arrayOfString.length; j++) {
                if (arrayOfString[i].compareTo(arrayOfString[j]) > 0) {
                    String temp = arrayOfString[i];
                    arrayOfString[i] = arrayOfString[j];
                    arrayOfString[j] = temp;
                }
            }
        }
        System.out.println("Enter word to search");
        String word = string.next();
        binary.binarySearch(arrayOfString, 0, arrayOfString.length, word);
    }

    public <K extends Comparable<K>> K binarySearch(K[] array, int low, int high, K data) {

        int mid = (low + high) / 2;

        if (data.equals(array[mid])) {
            System.out.println(data + " word is found ");
            return data;
        }

        if (mid == low) {
            System.out.println(data + " word cant found  ");
            return data;
        } else if (data.compareTo(array[mid]) > 0)
            binarySearch(array, mid, high, data);
        else
            binarySearch(array, low, mid, data);
        return data;
    }
}