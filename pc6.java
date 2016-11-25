/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 * 6. Sales Prediction
The East Coast sales division of a company generates 65 percent of total sales. Based on
that percentage, write a program that will predict how much the East Coast division will
generate if the company has $8.3 million in sales this year.
Hint: Use the value 0.65 to represent 65 percent.
 */
public class pc6 {
    public static void main(String[] args)
    {
        double percent=0.65;
        double sales=8300000;
        double prediction = (percent * sales) +sales;
        System.out.println("Your predicted generated sales this year will be $"+prediction);
        
    }
    
}
