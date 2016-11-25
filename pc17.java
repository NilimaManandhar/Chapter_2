/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterone;

/**
 *
 * @author Nilima M
 * 17. Word Game
Write a program that plays a word game with the user. The program should ask the user
to enter the following:
• His or her name
• His or her age
• The name of a city
• The name of a college
• A profession
• A type of animal
• A pet’s name
After the user has entered these items, the program should display the following story,
inserting the user’s input into the appropriate locations:
There once was a person named NAME who lived in CITY. At the age of AGE,
NAME went to college at COLLEGE. NAME graduated and went to work as a
PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
happily ever after!
 */
import javax.swing.JOptionPane; 
public class pc17 {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name ");
        String age =  JOptionPane.showInputDialog("Enter your age ");
         String city =  JOptionPane.showInputDialog("Enter your city ");
          String college =  JOptionPane.showInputDialog("Enter your college ");
           String profession =  JOptionPane.showInputDialog("Enter your profession ");
            String animal =  JOptionPane.showInputDialog("Enter your pet animal(type like cat or dog) ");
             String pet =  JOptionPane.showInputDialog("Enter your pet's name ");
             
             System.out.println("There once was a person named "+ name +" who lived in " + city +" . At the age of " +age+ ", " + name+
                " went to college at "+ college + ". "+ name + " graduated and went to work as an " + profession + ". Then, "
                        + name + " adopted a(n)"+ animal+ " named "+ pet + ". They both lived happily ever after!");
        
    }
}
