/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterone;

/**
 *
 * @author Nilima M
 * Write a program that computes the tax and tip on a restaurant bill. The program should ask
the user to enter the charge for the meal. The tax should be 7.5 percent of the meal charge.
The tip should be 18 percent of the total after adding the tax. Display the meal charge, tax
amount, tip amount, and total bill on the screen.
 */
import java.util.Scanner;
public class pc13 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the charge of the meal : ");
        double meal = input.nextDouble();
        double tax = 7.5/100;
        double taxAmount = tax*meal + meal;
        double tip=18/100;
        double tipAmount = tip*taxAmount+taxAmount;
        System.out.println("The meal charge is $" + meal );
        System.out.println("The tax amount is $"+ tax*meal);
        System.out.println("The tip amount is $"+ tipAmount);
        System.out.println("The total amount is $"+ tipAmount + meal);
        
    }
    
}
