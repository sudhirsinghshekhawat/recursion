package com.numbers;

public class CheckPrime
{
    static Object isPrime(int n,int i)
    {
        if(n<2)
            return  false;
        if(i==1)
             return  true;
        else if(n%i==0)
            return  false;
        else
            return  isPrime(n,i-1);
    }

    public static void main(String[] args)
    {
        System.out.println("is prime : "+isPrime(7,3));

    }

}
