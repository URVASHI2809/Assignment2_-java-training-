package com.rakuten;
import java.util.*;

public class PrimeNumbersInRange {

    public static boolean isPrime(int n) {
        if (n==0 || n==1) {
            return false;
        }
        if (n==2) {
            return true;
        }
        for(int i=2; i*i <= n; i++) {
            if (n % i ==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range starts from: ");
        int starts = sc.nextInt();

        System.out.print("Enter the range ends to: ");
        int ends = sc.nextInt();

        System.out.printf("\nPrime numbers between %d and %d are:\n",starts,ends);
        for(int i = starts; i<= ends; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

