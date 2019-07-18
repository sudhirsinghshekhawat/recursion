package com.basic;

import java.util.Scanner;

public class CountNoOfDigits
{

    static int nonRecursiveCountNoOfDigits(int number)
    {
        int count = 0;
        while(number>0)
        {
            count++;
            number/=10;
        }
        return  count;
    }


    static int recursiveCountNoOfDigits(int number)
    {
        if(number<=1)
            return 1;
        return 1+recursiveCountNoOfDigits(number/10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count digits : ");
        int number = sc.nextInt();

        int nonRecursiveCountOfDigits = nonRecursiveCountNoOfDigits(number);
        System.out.println("No of digits in "+number+" : "+nonRecursiveCountOfDigits);

        int recursiveCountOfDigits = recursiveCountNoOfDigits(number);
        System.out.println("No of digits in "+number+" : "+recursiveCountOfDigits);

    }


}
