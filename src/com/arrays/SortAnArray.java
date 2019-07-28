package com.arrays;

/**
 * @author sudhir
 * this class is used to sort an array using recursion
 */

import java.util.Arrays;

public class SortAnArray {


    public static void sortAnArray(int[] array, int n) {
        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        sortAnArray(array, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {11,2,3,4,1,99,67,54,43};
        sortAnArray(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }


}
