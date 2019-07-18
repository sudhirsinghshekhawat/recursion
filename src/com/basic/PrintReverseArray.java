package com.basic;

public class PrintReverseArray {
    public static void main(String[] args) {

        System.out.println("Jai Bhawani , Jai Pitra Maharaj : Date 27/06/19");
        int arr[] = {1,2,3,4};
        printArrayRecursively(arr,arr.length-1);
    }


    public static void printArrayRecursively(int[] arr, int i) {
        if (i < 0)
            return;

        System.out.println(arr[i]);
        printArrayRecursively(arr, --i);
    }
}
