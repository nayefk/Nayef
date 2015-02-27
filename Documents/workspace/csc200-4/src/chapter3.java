/**
 * Nayef Addamigh.
 * CSC 200.
 * This is s class exercise to use (Printf) in formats of (%s, %f, %c, %n, %d, %e).
 */
public class chapter3 {
	public static void main (String []args) {
		System.out.print(" In this program we will use the (printf) to see how it works.");
		{
			String word1 = "Hello";
			String word2 = "nayef";
				System.out.printf("%n %s %S", word1, word2); 
				// %n: is used to get a new line. 
				// %s: is used to get the string shown in the out print.
				// %S: the upper case letter makes the string show as upper case.
				
			int num1 = 22;
			int num2 = 11;
			int num3 = 1;
				System.out.printf("%n I will show you the average of 3 numbers wich are: %d, %d, %d,", num1, num2, num3);	
				//%d: is used to show the decimal integer number.
			double number1, number2, number3, average;
			number1 = 22.0;
			number2 = 11.0;
			number3 = 1.0;
			average = (number1+number2+number3)/3;
				System.out.printf("%n The average of the format is: %.2f" , average);	
				// %f: is used to show the floating-point number.
				// %.2f: the .2 is to show how many decimals that is wanted to show.
				System.out.printf("%n A character will show in upper and lower case (%C, %c)" , 'a', 'a');	
				//%c: is used to show a character.
				//%C: the upper case letter makes the character show as upper case.
				System.out.printf("%n the average will be presanted in exponential floating-point: %.3e", average);
				//%e: is used to show the number in an exponential floating-point number
		}
	}

}
