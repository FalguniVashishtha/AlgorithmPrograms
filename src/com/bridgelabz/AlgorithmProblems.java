package com.bridgelabz;
import java .util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class AlgorithmProblems {
    // Merge two sub arrays L and M into array
    void merge(int array[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int M[] = new int[n2];
        // fill the left and right array
        for (int i = 0; i < n1; i++)
            L[i] = array[l + i];
        for (int j = 0; j < n2; j++)
            M[j] = array[m + 1 + j];
        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = l;
        /* Until we reach either end of either L or M, pick larger among
        elements L and M and place them in the correct position at A[p..r]
        for sorting in descending
        use if(L[i] >= <[j])
        */
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }
        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    // Divide the array into two sub arrays, sort them and merge them
    void mergeSort(int array[], int left, int right) {
        if (left < right) {
            // m is the point where the array is divided into two sub arrays
            int mid = (left + right) / 2;
            // recursive call to each sub arrays
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            // Merge the sorted sub arrays
            merge(array, left, mid, right);
        }
    }

    //main method
    public static void main(String args[]) {
        // created an unsorted array
        int[] array = {7, 10, 11, 4, 6, 77, 99, 9, 1};
        AlgorithmProblems ob = new AlgorithmProblems(); //creating an object
        // call the method mergeSort()
        // pass argument: array, first index and last index
        ob.mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
    }

}

