package com.numbers;

public class DecimalToBinary
{
    static void decumalToBinary(int n)
    {
        if(n==1)
        {
            System.out.print(" 1");
            return;
        }
        else
        {

            decumalToBinary(n/2);
            System.out.print(" "+n%2);
        }
    }

     static int decimalToBinary(int n)
    {
        if(n==0)
            return 0;
        else
            return n%2+10*decimalToBinary(n/2);
    }

    public static void main(String[] args)
    {
        decumalToBinary(9);
        System.out.println();
        System.out.println(decimalToBinary(9));

    }
}
