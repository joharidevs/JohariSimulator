/*JohariSimulator.java
 *By Daniel Taylor
 *Created November 3, 2014
 *Update November 24, 2014
 *
 *Version 0.1 (Alpha)
 */
 
import java.util.Scanner;
 
public class JohariSimulator
{	
    public static void main(String[] arg)
    {
    	User user = new User();
    	Scanner in = new Scanner(System.in);
   	//Welcome
    	System.out.print("Welcome to JohariSimulator, an open-world game, where you can raise your very own virtual Johari!");
    		String nextLine = in.nextLine();
    	System.out.print("Let's go to the Johari farm to get your first Johari!");
    		nextLine = in.nextLine();
    	System.out.println("Would you like to adopt a male or female Johari? (Type m or f to choose.)");
    	
    	//Gender Select
    	char genderInput  = in.nextLine().charAt(0);
    		while (genderInput!='m' && genderInput!='f')
    		{
    			System.out.println("That's not a valid input!  Please type 'm' or 'f' to choose what gender of Johari you would like to a adopt.");
				genderInput  = in.nextLine().charAt(0);
    		}
    	//Name Select
    	System.out.println("What would you like to name your Johari? (Leave blank for default.)");
    	String nameInput = in.nextLine();
    	
    	//Default Names
    String JohariName;
    
    	if (nameInput.equals(""))
    	{
    		if (genderInput=='m')
    		{
    			JohariName = "C. Johari";
    		}
    		else
    		{
    			JohariName = "Kayla";
    		}
    	}
    	 else
    	 {
    	 	JohariName = nameInput; 
    	 }
    	
    	//Pronoun Variables
    	String himher;
    	String heshe;
    	
    	if (genderInput=='m')
    	{
    		himher = "him";
    		heshe = "he";
    	}
    	else
    	{
    		himher = "her";
    		heshe = "she";
    	}
    //Intro
    	System.out.print(JohariName +" seems to like you!  Time to take "+himher+" home...");
    		nextLine = in.nextLine();
    	for (int i = 0; i < 50; ++i) System.out.println();
    	System.out.print("Let's start learning how to take care of "+ JohariName +"!");
    		nextLine = in.nextLine();

    	System.out.println(user.itemIndex());
    	System.out.println("Look up! That's your items index. To access your items index at any time, press the letter 'I' and you can see it!");
    	
    	String input = in.nextLine();
		System.out.println(user.checkInput(input));
    	
    }
}
