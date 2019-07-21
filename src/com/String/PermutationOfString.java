package com.String;

/**
 * @author sudhir
 * This program is an example of get the all permutation of given Sting
 */

public class PermutationOfString
{
    /**
     *
     * @param arr String to char Array
     * @param length Length of character array (should be passed length-1)
     */
    public  static  void  stringPermutation(char[] arr,int length)
    {
        if(length==1)
        {
            System.out.println(arr);
            return;
        }
        else
        {
            for(int i=0;i<length;i++)
            {
                swap(arr,i,length-1);
                stringPermutation(arr,length-1);
                swap(arr,i,length-1);
            }
        }
    }

    /**
     * Swap method used for swaping character for array
     * @param arr char array
     * @param i  swapping index 1
     * @param j  swapping index 2
     * @return char array
     */
    public static char[] swap(char[] arr,int i,int j)
    {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
        return arr;
    }

    public static void main(String[] args) {
        char[] arr = {'a','b','b','a'};
        stringPermutation(arr,arr.length);
    }



}
