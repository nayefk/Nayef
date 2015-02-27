import java.util.Scanner;
/**
 * Author: Nayef 
 * Date: 1/28/2015
 * Email: nka2709@email.vccs.edu
 * The program will find the average of 10 numbers
 */
public class Exercise3 {
	public static void main(String [] args) {
		//
		int total = 0; // the sum of the numbers 
		int grade; // numbers entered individually 
		int average; // the total of the numbers added then divided by 10
		int counter = 0; // the counter of the variable entries  
		Scanner input = new Scanner(System.in); // use ',' as delimiter 
		System.out.println("Today we will show you the average of 10 numbers \nEnter 10 number ( delimited by ',') :"); //escape sequence and delimiter by ','
		while (counter < 10) // the maximum numbers  
		{
			input.useDelimiter(",");	
			grade = input.nextInt();
			total = total + grade;
			counter++; // all numbers entered are added together  
		}
		average = total/10;
		System.out.println("Your average is :\t\"" + average + "\""); //escape sequence
		input.close();
	}
}
