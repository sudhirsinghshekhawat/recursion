package com.numbers;

public class ExponentOfNumber
{

    static long nonRecursivePowerCalculation(int number,int power)
    {
        long calculatedPower = 1;
        while(power>0)
        {
            calculatedPower = calculatedPower*number;
            power--;
        }
        return  calculatedPower;
    }

    static long recursivePowerCalculation(int number,int power)
    {
        if(power==0)
            return 1;
        return  number*recursivePowerCalculation(number,power-1);
    }



    public static void main(String[] args)
    {
        int number = 5;
        int power = 2;

        System.out.println("Non recursive power calculated : "+nonRecursivePowerCalculation(5,2));
        System.out.println("recursive power calculated : "+recursivePowerCalculation(5,2));

    }





}
