import java.util.Scanner;
/**
 * @author mac
 *
 *
 */
public class chapter2 {
	public static void main(String [] args) {
	String s1,s2;
	
	Scanner keyboard2 = new Scanner(System.in); // use ## as delimiter
	keyboard2.useDelimiter(",");



	System.out.println("enter a text (delimted by , :");
	s1 = keyboard2.next();
	s2 = keyboard2.next();
	System.out.println("the word \"" + s1 + "\"\n\"" + s2 + "\""); //escape sequence 

	
	}
}