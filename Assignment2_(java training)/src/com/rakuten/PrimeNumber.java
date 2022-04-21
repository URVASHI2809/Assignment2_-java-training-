package com.rakuten;

public class PrimeNumber {

    public static boolean isPrime(long n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String args[])
    {
        if (isPrime(0))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(1))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(2))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(3))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(4))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(5))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(323))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(337))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(6737626471L))
            System.out.println(" false");
        else
            System.out.println(" true");
        if (isPrime(117342557809L))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}

