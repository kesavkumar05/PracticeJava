//Implement a while loop that prints out the multiplication table of the given input number.
package PracticeJava.Loops;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Positive number");
		int num = sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(num+"x"+ i +"="+num*i);
			i++;
		}
		
	}
}
