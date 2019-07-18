package com.numbers;

public class Fibonaci
{
    static void nonRecursiveFibonaci(int n)
    {
        System.out.print("0,1");
        int t1 = 0;int t2 = 1;

        for(int i=2;i<n;i++)
        {
            int sum = t1+t2;
            t1 = t2;
            t2 = sum;
            System.out.print(","+sum);
        }
    }

    static  int recursiveFibonaci(int n)
    {
        if(n<=1)
            return n;
        else
            return recursiveFibonaci(n-1)+recursiveFibonaci(n-2) ;
    }

    public static void main(String[] args)
    {
        nonRecursiveFibonaci(5);
        System.out.println();
        int num=5;
        int i=0;
        while (i<num)
        {
            System.out.print(" "+recursiveFibonaci(i));
            i++;
        }


    }





}
