package com.String;

import java.util.Arrays;

public class CountTotalNoOfWovels
{
    static  int totalNoOfWovels(int len, int index,String str)
    {
        int count=0;
        if (len==0)
            return 0;

        char single = Character.toUpperCase(str.charAt(index));
        if(single=='A'||single=='E'||single=='I'||single=='O'||single=='U')
            count++;
        return  count+totalNoOfWovels(len-1,index+1,str);
    }

    public static void main(String[] args)
    {
        System.out.println("Total no of Wovels in : SUhdir Singh is "+totalNoOfWovels(13,0,"Sudhir Singhi"));

    }
}
