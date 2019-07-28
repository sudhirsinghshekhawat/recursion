package com.arrays;

/**
 * @author sudhir
 * this class is used to invert an array using recursion
 */

import java.util.Arrays;
public class InvertPositionInArray
{
    private  static  void invertArray(int[] arr,int currentIndex)
    {
        if(currentIndex<arr.length/2)
        {
            int temp = arr[currentIndex];
            arr[currentIndex] = arr[arr.length-1-currentIndex];
            arr[arr.length-1-currentIndex] = temp;

            invertArray(arr,currentIndex+1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        invertArray(array,0);
        System.out.println(Arrays.toString(array));
    }
}
