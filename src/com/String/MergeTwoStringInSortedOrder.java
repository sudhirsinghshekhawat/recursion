package com.String;

public class MergeTwoStringInSortedOrder
{
    static  String mergeTwoStringInSortOrder(String str1,String str2)
    {
        if (str1==null||str1.equals(""))
            return str2==null?str1:str2;
        else if(str2==null||str2.equals(""))
            return  str1;
        else if(str2.charAt(0)>str1.charAt(0))
            return  str1.charAt(0)+mergeTwoStringInSortOrder(str1.substring(1,str1.length()),str2);
        else
            return str2.charAt(0)+mergeTwoStringInSortOrder(str1,str2.substring(1,str2.length()));
    }


    public static void main(String[] args)
    {
        System.out.println("Merged String = "+mergeTwoStringInSortOrder("cnt","ace"));

    }


}
