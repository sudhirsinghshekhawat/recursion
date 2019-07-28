package com.arrays;

/**
 * @author sudhir
 * This method is used to check find first occurance in array
 */
public class FindFirstOccuranceInArray
{

    /**
     * @param arr an integer array
     * @param num a number
     * @param currentIndex current index to check recursion
     * @return
     */
    private  static int firstOccurance(int arr[],int num,int currentIndex)
    {
        if(arr.length==currentIndex)
            return -1;
        else if(arr[currentIndex] == num)
            return  currentIndex;
        else
            return  firstOccurance(arr,num,currentIndex+1);
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,4,1,7,8,3};

        int num = 3;

        System.out.println(firstOccurance(arr,3,0));

    }

}
