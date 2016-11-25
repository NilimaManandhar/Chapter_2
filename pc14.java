/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterone;

/**
 *
 * @author Nilima M
 * 14. Stock Commission
Kathryn bought 1000 shares of stock at a price of $25.50 per share. She must pay her stock
broker a 2 percent commission for the transaction. Write a program that calculates and
displays the following:
• The amount paid for the stock alone (without the commission)
• The amount of the commission
• The total amount paid (for the stock plus the commission)
 */
public class pc14 {
    public static void main(String[] args)
    {
        double shares = 1000;
        double price = 25.50;
        double total=shares*price;
        double stockPayment = (.02*total);
        double totalT=stockPayment+total;
        System.out.println("The amount paid for stock is $"+ total);
        System.out.println("The amount of commision : "+ stockPayment);
        System.out.println("The total amount paid : $"+ totalT);
                
                
    }
    
}
