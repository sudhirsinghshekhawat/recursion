package com.arrays;


/**
 * @author sudhir
 * This code is used to check pellindrome array using recursion
 */

public class ArrayIsPallindrome
{
    /**
     * This method is used to check pellindrome array
     * @param array an array of numbers
     * @param idx index
     * @return boolean
     */
    private  static  boolean isPellindrome(int[] array,int idx)
    {
        if(idx==array.length/2)
            return  true;
        else if(array[idx]!=array[array.length-1-idx])
            return  false;
        else
            return isPellindrome(array,idx+1);
    }

    public static void main(String[] args)
    {
        int array[] = {1,2,3,4,3,2,1};
        System.out.println(isPellindrome(array,0));
    }


}
