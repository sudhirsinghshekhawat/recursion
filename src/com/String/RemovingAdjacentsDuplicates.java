package com.String;

public class RemovingAdjacentsDuplicates
{
    static String removeDuplicates(String text)
    {
        if(text.length()==1)
            return  text;
        if(text.substring(0,1).equals(text.substring(1,2)))
            return  removeDuplicates(text.substring(1));
        else
            return text.substring(0,1)+removeDuplicates(text.substring(1));
    }



    public static void main(String[] args)
    {

        System.out.println(removeDuplicates("Helllooo Worrrllld"));

    }

}
