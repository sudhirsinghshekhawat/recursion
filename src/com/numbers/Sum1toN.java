package com.numbers;

public class Sum1toN
{
    static int nonRecursiveSumAll(int n)
    {
        int sum = 0;
        if(n<1)
            return n;

        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return  sum;
    }

    static int recursiveSumAll(int n)
    {
        if(n==1)
            return 1;
        else
            return  n+recursiveSumAll(n-1);
    }



    public static void main(String[] args)
    {
        System.out.println("Non recursive sum up to 5 : "+nonRecursiveSumAll(5));
        System.out.println("Recursive sum up to 5 : "+recursiveSumAll(5));


    }





}
