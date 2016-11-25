/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 * 5. Cookie Calories
A bag of cookies holds 40 cookies. The calorie information on the bag claims that there
are 10 servings in the bag and that a serving equals 300 calories. Write a program that lets
the user enter the number of cookies he or she actually ate and then reports the number of
total calories consumed.
 */
import javax.swing.JOptionPane;
public class pc5 {
    public static void main(String[] args)
    {
        int caloriesPerCookie = 300/10;
        int cookiesConsumedByUser =Integer.parseInt(JOptionPane.showInputDialog("Enter the number of cookies eaten : "));
        int totalCaloriesConsumed = cookiesConsumedByUser * caloriesPerCookie;
        JOptionPane.showMessageDialog(null, "You consumed : "+ totalCaloriesConsumed+ ".");
    }
    
}
