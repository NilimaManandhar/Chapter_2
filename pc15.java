/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterone;

/**
 *
 * @author Nilima M
 * 
 * 15. Ingredient Adjuster
A cookie recipe calls for the following ingredients:
• 1.5 cups of sugar
• 1 cup of butter
• 2.75 cups of flour
 */
import java.util.Scanner;
public class pc15 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cookies you want to bake : ");
        double userCookie= input.nextDouble();
        double regularCookie = 48;
        double regularSugar=1.5;
        double regularButter=1;
        double regularFlour=2.75;
        
        double userSugar = userCookie/regularCookie*regularSugar;
        double userButter= userCookie/regularCookie*regularButter;
        double userFlour=userCookie/regularCookie*regularFlour;
        
        System.out.println("You need the following to bake "+ userCookie);
        System.out.println( userSugar + " cup(s) of sugar");
        System.out.println(userButter + " cup(s) of butter");
        System.out.println(userFlour + " cup(s) of flour.");
    }
    
}
