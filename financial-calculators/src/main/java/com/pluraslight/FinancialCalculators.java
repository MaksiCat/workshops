package com.pluraslight;
import java.util.Scanner;
public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in) ;
        double monthlyPayment = 0;
        System.out.print("Enter the desired loan amount: ");
        double principal = keyboard.nextDouble();
        System.out.print("Enter your interest rate (e.g. 5 for 5%): ");
        double interestRate = keyboard.nextDouble() / 100;
        System.out.print("How many years the loan lasts: ");
        int loanLength = keyboard.nextInt();
        int numberOfMonthlyPayments = loanLength * 12;
        double monthlyInterestRate = interestRate / 12;
        monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments) - 1);
        double totalInterest = (monthlyPayment * numberOfMonthlyPayments) - principal;
        System.out.printf("\nYour expected monthly payment: $%.2f", monthlyPayment);
        System.out.printf("\nYour total interest paid: $%.2f", totalInterest);
        keyboard.close();


    }
}
