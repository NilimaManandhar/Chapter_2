/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterone;

/**
 *
 * @author Nilima M
 * 16. Energy Drink Consumption
A soft-drink company recently surveyed 15,000 of its customers and found that approximately
18 percent of those surveyed purchase one of more energy drinks per week. Of those
customers who purchase energy drinks, approximately 58 percent of them prefer citrusflavored
energy drinks. Write a program that displays the following:
• The approximate number of customers in the survey who purchase one or more
energy drinks per week
• The approximate number of customers in the survey who prefer citrus-flavored energy
drinks
 */
public class pc16 {
    public static void main(String[] args)
    {
        int survey=15000;
        double energy = survey*.18;
        System.out.println("the num of people who purchase one or more per week is "+ energy);
        double citrus = .58* energy;
        System.out.println("People who prefer citrus is "+ citrus);
    }
    
}
