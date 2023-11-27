/* Question:
Using Eclipse, write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
below 1000$	N/A
Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.*/

package PracticeJava.ControlFlow;
import java.util.Scanner;
public class CommissionCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long userInput = sc.nextLong();
		if(userInput>=10000) {
			double commission=userInput*0.3;
			System.out.println(commission);
		}
		else if(userInput>=5000 && userInput<=9999) {
			double commission=userInput*0.2;
			System.out.println(commission);
		}
		else if(userInput>=1000 && userInput<=4999) {
			double commission=userInput*0.1;
			System.out.println(commission);
		}
		else {
			System.out.println("N/A");
		}
		sc.close();
	}

}
