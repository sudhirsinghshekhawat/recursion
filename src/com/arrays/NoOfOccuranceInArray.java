package com.arrays;

/**
 * @author sudhir
 * this class is used to find occurance of number in an array
 */
public class NoOfOccuranceInArray
{
    private  static  int numOfOccurance(int arr[],int key,int currentIndex)
    {
        if(arr.length==currentIndex)
            return  0;
        else if(arr[currentIndex]==key)
            return  1+numOfOccurance(arr,key,currentIndex+1);
        else
            return  numOfOccurance(arr,key,currentIndex+1);
    }

    public static void main(String[] args)
    {
        int num=3;
        int arr[] = {2,3,4,1,7,8,3};
        System.out.println(numOfOccurance(arr,3,0));

    }



}
