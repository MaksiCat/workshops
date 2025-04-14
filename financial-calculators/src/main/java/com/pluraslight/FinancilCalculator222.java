package com.pluraslight;
import java.util.Scanner;
public class FinancilCalculator222 {
    public static void main(String[] args) {
        int daysPerYear = 365;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your deposit: ");
        double principal = keyboard.nextDouble();
        System.out.print("Enter your interest rate (e.g. 5 for 5%): ");
        double interestRate = keyboard.nextDouble() / 100;
        System.out.print("How long does the deposit last: ");
        int numberOfYears = keyboard.nextInt();
        double futureValue = principal * Math.pow((1 + (interestRate / daysPerYear)),(daysPerYear * numberOfYears));
        double totalIterestEarned = futureValue - principal;
        System.out.printf("\nThe future value is $%.2f", futureValue);
        System.out.printf("\nThe total interest earned is $%.2f", futureValue );
        keyboard.close();

    }
}
