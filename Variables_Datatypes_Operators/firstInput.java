/*Activity 1 (Introduction): My First Input
Open your Eclipse IDE and follow the instructions below
Create a project called 'MyFirstInput'
Create a class called MyFirstInput
Add a main method to your app.
Make your code looks like the file shown below
Run your application.
Notice the prompt on the IntelliJ console asking you to enter your name.
Have a discussion with your pair partner on what you think each line of the code above does.*/

package PracticeJava.Variables_Datatypes_Operators;
import java.util.Scanner;
public class firstInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = sc.nextLine();
		System.out.println("My name is: "+name);

	}

}
