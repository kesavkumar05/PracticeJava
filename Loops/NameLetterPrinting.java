/*Question:
Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
Hint You can use the following String functions:

lenght() -> returns the total number of characters of a given String
chartAt(i) -> returns the character at the given position(i) of a String*/

package PracticeJava.Loops;
import java.util.Scanner;
public class NameLetterPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = sc.nextLine();
		System.out.println("Printing each letter of Given Name:");
		for(int i=0;i<name.length();i++) {
			char letter=name.charAt(i);
			System.out.println("Letter at Position "+i+": "+letter);
		}
	}

}
