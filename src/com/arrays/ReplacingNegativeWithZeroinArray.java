package com.arrays;

/**
 * @author sudhir
 * this class is used to replace negative number with zero
 */

import java.util.Arrays;

public class ReplacingNegativeWithZeroinArray
{
    private static void replaceNegativeValues(int[] a, int currentIndex)
    {
        if(currentIndex==a.length)
            return;
        else if(a[currentIndex]<0)
        {
            a[currentIndex]=0;
            replaceNegativeValues(a,currentIndex+1);
        }
        else
        {
            a[currentIndex]=a[currentIndex];
            replaceNegativeValues(a,currentIndex+1);
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {2,3,-4,1,-7,8,-3};
        replaceNegativeValues(arr,0);
        System.out.println(Arrays.toString(arr));



    }



}
