/*Question:
A movie cinema does price discounting depending on a customer's age.
The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
Age range	Ticket Price
Normal ticket	7 Euros
Below 5	60% Discount
Over 60	55% Discount
Write the app so that the conditions above are met and the correct ticket price is returned.
Extra features
If done with the first part of the exercise with time to spare add the following feature.

Have the app prompt normal ticket buyers for the number of tickets they wish to buy.
For every two or more tickets sold, give a 30% discount.
*/

package PracticeJava.ControlFlow;
import java.util.Scanner;
public class MoviesDiscounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tickets you wish to buy:");
		int noOfTickets = sc.nextInt();
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		
		double normalPrice=7.0;
		double ticketPrice = 0;
		if(age<=0) {
			System.out.println("Invalid Age.");
			
		}
		else if(age<5) {
			ticketPrice=normalPrice * 0.4 * noOfTickets;
		}
		else if(age>60) {
			ticketPrice=normalPrice * 0.45 * noOfTickets;
		}
		else {
			if(noOfTickets>=2) {
				ticketPrice=normalPrice * 0.7 * noOfTickets;
			}
			else {
				ticketPrice=normalPrice * noOfTickets;
			}
		}
		System.out.println("Ticket Price: " + ticketPrice + " Euros");
		sc.close();
	}
}
