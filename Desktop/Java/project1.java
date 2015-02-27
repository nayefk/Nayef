package csc201;

import java.security.Signer;
import java.util.Scanner;
/**
 * This class implements the multiplication of tow numbers.
 * @author Nayef Addamigh
 */
public class project1 {
	public static void main(String[] args)
	
	{
    
		System.out.println("Hello.");
        System.out.println("I will moltiply two numbers for you.");
        System.out.println("Enter two whole numbers on a line:");
      
        int n1, n2;
        
        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt ( );
        n2 = keyboard.nextInt ( );
        
        System.out.println("The multiplication of those two numbers is");
        System.out.println(n1 * n2);
	   
	}
	}

