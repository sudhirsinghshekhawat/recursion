package com.basic;

import java.util.Scanner;

public class Factorial
{

    static int recursiveFactorial(int n)
    {
        if(n==0)
            return 1;
        return n* recursiveFactorial(n-1);
    }

    static int nonRecursiveFactorial(int n)
    {
        int factorialResult = 1;

        for (int i=1;i<=n;i++)
        {
            factorialResult = factorialResult*i;
        }
        return  factorialResult;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no for factorial : ");
        int num = sc.nextInt();
        int recursiveFactorial = recursiveFactorial(num);
        System.out.println("Value of recursiveFactorial "+num+"  = "+recursiveFactorial);

        int nonRecursiveFactorial = nonRecursiveFactorial(num);
        System.out.println("Value of nonRecursiveFactorial "+num+" = "+nonRecursiveFactorial);
        sc.close();

    }

}
