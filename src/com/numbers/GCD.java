package com.numbers;

public class GCD
{

    static int nonRecursiveGCD(int num1,int num2)
    {
        if(num1==num2)
            return num1;

        while(num1!=num2)
        {
            if (num1>num2)
                num1-=num2;
            else
                num2-=num1;
        }
        return  num1;
    }

    static int recursiveGCD(int num1,int num2)
    {
        if(num1==num2)
            return  num1;

        if(num1>num2)
            return  recursiveGCD(num1-num2,num2);
        else
            return  recursiveGCD(num1,num2-num1);

    }

    public static void main(String[] args)
    {
        System.out.println("Non recursive GCD of 18,24 is "+nonRecursiveGCD(18,24));
        System.out.println("Recursive GCD of 18,24 is "+recursiveGCD(18,24));

    }



}
