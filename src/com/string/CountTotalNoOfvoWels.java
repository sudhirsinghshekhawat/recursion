package com.string;

/**
 * @author sudhir  singh shekhawat
 * This is an example for count the no of wovels in string in recursive way
 */
public class CountTotalNoOfvoWels
{
    /**
     * This method is used to count total number of vowels in string
     * @param len length of string
     * @param index index
     * @param str string
     * @return int (no of vowels)
     */
    static  int totalNoOfvowels(int len, int index, String str)
    {
        int count=0;
        if (len==0)
            return 0;

        char single = Character.toUpperCase(str.charAt(index));
        if(single=='A'||single=='E'||single=='I'||single=='O'||single=='U')
            count++;
        return  count+ totalNoOfvowels(len-1,index+1,str);
    }

    public static void main(String[] args)
    {
        System.out.println("Total no of Wovels in : SUhdir Singh is "+ totalNoOfvowels(13,0,"Sudhir Singhi"));

    }
}
