import java.util.Scanner;

public class WhatDoesThisCodeDoPart2 {

    public static void main(String[] args) {

        //variable initializer 0 is redundant
        Scanner keyboard = new Scanner(System.in);
        double l = 0;
        double i = 0;
        double mp = 0;
        double bal = 0;
        int trm;

        //redundant call to 'printf()'
        System.out.printf("Enter the loan amount: ");
        l = keyboard.nextDouble();

        System.out.printf("Enter the interest rate on the loan: ");
        i = keyboard.nextDouble();

        //This is how long the bank owns you.
        System.out.printf("Enter the term (years) for the loan payment: ");
        trm = keyboard.nextInt();

        //This is a big line.
        System.out.printf("\n======================================\n");
        keyboard.close();

        mp = getMonthlyPayment(l, i, trm);
        bal = -(mp * (trm * 12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", bal);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", mp);
    }

    //access can be private
    public static double getMonthlyPayment(double l, double i, int trm) {
        double rate = (i / 100) / 12;
        double base = (1 + rate);
        double months = trm * 12;
        //Variable 'result' initilaizer "0.0" is redundant. Like on a basketball jersey when someone has 00 instead of just 0. Former Wizards player Gilbert Arenas wore 0 on his jersey, because that's how many minutes they said he would play in college.
        double result = 0.0;
        result = ((rate * l) / (1 - Math.pow(base, -months)));

        return result;
    }
}

/**//*
What does this code do? Part 2
        This code is poorly commented. Actually, it has no comments at all. To make matters worse, the variables are not appropriately named. Can you figure out what this program actually does? Would you like to be the person who is assigned the task of maintaining code like this?

        import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double l = 0;
        double i = 0;
        double mp = 0;
        double bal = 0;
        int trm;

        System.out.printf("Enter the loan amount: ");
        l = keyboard.nextDouble();

        System.out.printf("Enter the interest rate on the loan: ");
        i = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        trm = keyboard.nextInt();

        System.out.printf("\n======================================\n");
        keyboard.close();

        mp = getMonthlyPayment(l, i, trm);
        bal = -(mp*(trm*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", bal);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", mp);
    }


    public static double getMonthlyPayment(double l, double i, int trm) {
        double rate = (i/ 100) / 12;
        double base = (1 + rate);
        double months = trm* 12;
        double result = 0.0;
        result = ((rate * l) / (1 - Math.pow(base, -months)));

        return result;
    }
}
    Your assignment
    Clean up the following code by adding comments where appropriate. If you read the program carefully you should be able to follow it. Also, rename variables and methods to be meaningful and consistent.*/
