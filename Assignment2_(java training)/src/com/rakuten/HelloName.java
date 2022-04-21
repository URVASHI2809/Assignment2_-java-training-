package com.rakuten;
import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.print("Enter name: ");
            String name = input.next();
            System.out.print("\nHello, " +name+ "!");
        }
}
