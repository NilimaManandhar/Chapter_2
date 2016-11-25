/**2. Name and Initials
Write a program that has the following String variables: firstName, middleName, and
lastName. Initialize these with your first, middle, and last names. The program should also
have the following char variables: firstInitial, middleInitial, and lastInitial. Store
your first, middle, and last initials in these variables. The program should display the contents
of these variables on the screen.
 *
 * @author Nilima M
 */
public class pc2 {
    public static void main(String[] args)
    {
        String firstName;
        String middleName;
        String lastName;
        firstName = "John";
        middleName="Jake";
        lastName="Smith";
        char f='J';
        char m='J';
        char l='S';
        
        //Display the contents on the page
        System.out.println("Your name is "+ firstName +" "+ middleName+" "+ lastName );
        System.out.println("Your initials is "+ f+ "."+m+"."+ l+".");
        
        
        
                
    }
    
}
