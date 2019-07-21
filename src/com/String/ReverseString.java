package com.String;

/**
 * @author sudhir singh shekhawat
 * This class is an example of  reverse a String in recursive way
 */
public class ReverseString
{
   static String reverseString(String str)
   {
       if(str.isEmpty())
           return  str;
       else
           return  reverseString(str.substring(1))+str.charAt(0);
   }

    public static void main(String[] args)
    {
        System.out.println("Reverse of Sudhir is : "+reverseString("Sudhir"));

    }
}
