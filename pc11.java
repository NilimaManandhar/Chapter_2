/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterone;

/**
 *
 * @author Nilima M
 * 11. Male and Female Percentages
Write a program that asks the user for the number of males and the number of females
registered in a class. The program should display the percentage of males and females in
the class.
Hint: Suppose there are 8 males and 12 females in a class. There are 20 students in the
class. The percentage of males can be calculated as 8 ÷ 20 = 0.4, or 40%. The percentage
of females can be calculated as 12 ÷ 20 = 0.6, or 60%.
 */
import java.util.Scanner;
public class pc11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of males : ");
        double males = input.nextDouble();
        System.out.print("Enter the number of females : ");
        double females = input.nextDouble();
        double total =males+females;
        double malePercentage = (males/total)*100;
        double femaePercentage = (females/total)*100;
        System.out.println("Male percentage "+ malePercentage+ "%");
        System.out.println("Female Percentage "+ femaePercentage+ "%");
        
    }
}
