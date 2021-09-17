/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Michael Andrich
 */
/*

    prompt user for item 1 quantity and price
    prompt user for item 2 quantity and price
    prompt user for item 3 quantity and price
    add together the cost of all items
    run the tax on subtotal
    add tax and subtotal for final total


 */


import java.util.Scanner;

public class solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        String num1 = sc.nextLine();
        int p1 = Integer.parseInt("" + num1);

        System.out.println("Enter the quantity of item 1: ");
        String num2 = sc.nextLine();
        int q1 = Integer.parseInt("" + num2);

        int pq_1 = (p1 * q1);

        System.out.println("Enter the price of item 2: ");
        String num3 = sc.nextLine();
        int p2 = Integer.parseInt("" + num3);

        System.out.println("Enter the quantity of item 2: ");
        String num4 = sc.nextLine();
        int q2 = Integer.parseInt("" + num4);

        int pq_2 = (p2 * q2);

        System.out.println("Enter the price of item 3: ");
        String num5 = sc.nextLine();
        int p3 = Integer.parseInt("" + num5);

        System.out.println("Enter the quantity of item 3: ");
        String num6 = sc.nextLine();
        int q3 = Integer.parseInt("" + num6);

        int pq_3 = (p3 * q3);

        double sub = (pq_1 + pq_2 + pq_3);

        System.out.println("Subtotal: $" + (sub) + "");

        double tax = (sub * 0.055);

        System.out.println("Tax: $"+(tax)+"");

        double total = (sub + tax);

        System.out.println("Total: $"+(total)+"");
    }
}
