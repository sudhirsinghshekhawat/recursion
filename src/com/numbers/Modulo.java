package com.numbers;

public class Modulo
{

    static int nonRecursiveModulo(int dividend,int divisor)
    {
        if(divisor==0)
        {
            System.out.println("divisor should not be zero");
            return  -1;
        }
        return  dividend%divisor;
    }

    static int recursiveModulo(int dividend,int divisor)
    {
        if(divisor==0)
        {
            System.out.println("Divisor should not be zero");
            return  -1;
        }

        if(dividend<divisor)
            return  dividend;
        else
            return  recursiveModulo(dividend-divisor,divisor);
    }


    public static void main(String[] args)
    {
        System.out.println("Non recursive reminder of 16 %7 = "+nonRecursiveModulo(16,7));
        System.out.println("Recursive reminder of 16 %7 = "+recursiveModulo(16,7));

    }


}
