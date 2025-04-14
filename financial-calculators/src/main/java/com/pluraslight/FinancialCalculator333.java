package com.pluraslight;
import java.util.Scanner;
public class FinancialCalculator333 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your monthly payout: ");
        double monthlyPayout = keyboard.nextDouble();
        System.out.print("Enter yor iterest rate (e.g. 5 for 5%): ");
        double interestRate = keyboard.nextDouble() / 100;
        System.out.print("Years for pay out: ");
        int payOutYears = keyboard.nextInt();
        int numberOfPeriods = payOutYears * 12;
        double periodInterestRate = interestRate / 12;
        double presentValue = monthlyPayout * ((1 - Math.pow((1 + periodInterestRate), -(numberOfPeriods))) / periodInterestRate);
        System.out.printf("\nThe present value of annuity is $%.2f", presentValue);
        keyboard.close();
        }

    }

