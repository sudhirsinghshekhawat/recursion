package com.String;

/**
 * @author sudhir singh shekhawat
 * This is an example of merge two string in sorted order
 */
public class MergeTwoStringInSortedOrder
{
    /**
     * Method used for merge two String
     * @param str1 first parameter as string
     * @param str2 second parameter as String
     * @return String
     */
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
