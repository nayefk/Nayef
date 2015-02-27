/**
 * Nayef Addamigh
 * CSC 200
 * Application to check your username and password
 */
import java.util.Scanner;
public class chapter4 {
public static void main(String[] args){
	System.out.println("Enter your username:");
	Scanner keyboard = new Scanner (System.in);
	String username = keyboard.next();
	System.out.println("Enter your password");
	String password = keyboard.next();
	// The program will make suer that the user wrote the right username and password in the next steps.
	if (username.equals ("nayef")) 
	if (password.equals ("1234"))
	{
		System.out.println("Welcome User"); // If the username and password were right the program will show this message.
	} else { 
		System.out.println("Wrong Username or Password!"); // If the user name and password were wrong the program will show this message.
	}
}
}
