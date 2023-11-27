/*Activity 3: Variable Naming and Type Casting
Open your Eclipse IDE and follow the instructions below
Create a project on IntelliJ. This time feel free to give it an appropriate name. hint We're going to be finding the area and perimeter of a circle.
Write a java application that prompts a user to enter the diameter of a circle and calculates the area and perimeter of the circle.
Perform a widening casting operation (integer to double) when storing the result of the operations.
Print out the results of the two operations in the console.*/

package PracticeJava.Variables_Datatypes_Operators;
import java.lang.Math;
import java.util.Scanner;
public class Variablename_Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the diameter of circle:");
		int diameter = sc.nextInt();
		double radius = diameter/2.0;
		double area = Math.PI * Math.pow(radius, 2);
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Area of circle: "+area);
		System.out.println("Perimeter of circle: "+perimeter);
	}
}
