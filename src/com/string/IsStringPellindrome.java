package com.string;

/**
 * @author sudhir singh shekhawat
 * This is an example of check string is pellindrome or not in recursive way
 */
public class IsStringPellindrome
{

    /**
     * This is Recursive method which is used to check string is Pellindrome or not.
     * @param str (string)
     * @return Object of boolean(true,false)
     */
    public  static Object isStringPellindrome(String str)
    {
        if(str.length()==0||str.length()==1)
            return  true;
        else
        {
            if(str.charAt(0)==str.charAt(str.length()-1))
                return  isStringPellindrome(str.substring(1,str.length()-1));
        }
        return  false;
    }

    public static void main(String[] args)
    {
        System.out.println(isStringPellindrome("HeeH"));


    }





}
