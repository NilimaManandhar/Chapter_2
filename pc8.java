/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 * 8. Sales Tax
Write a program that will ask the user to enter the amount of a purchase. The program should
then compute the state and county sales tax. Assume the state sales tax is 5.5 percent
and
the county sales tax is 2 percent. The program should display the amount of the purchase,
the state sales tax, the county sales tax, the total sales tax, and the total of the sale (which is
the sum of the amount of purchase plus the total sales tax).
Hint: Use the value 0.02 to represent 2 percent, and 0.055 to represent 5.5 percent.
 */
import java.util.Scanner;
public class pc8 {
    public static void main(String[] args)
    {
        System.out.print("Enter the amount of purchase : ");
        Scanner input = new Scanner(System.in);
        double purchase = input.nextDouble();
        double countyTax = 0.02;
        double cttotal = countyTax*purchase+purchase;
        double totalSalesTax = .055;
        double tsttotal=totalSalesTax*purchase+purchase;
        double totalTax= countyTax+totalSalesTax;
        
        double total=totalTax*purchase+purchase;
        System.out.println("Your total purchase amount is : $"+ purchase);
        System.out.println("County Tax $"+ cttotal );
        System.out.println("Total Sales Tax $: "+ tsttotal);
        System.out.println("County + Sales tax :$"+ total);
                
    }
}
