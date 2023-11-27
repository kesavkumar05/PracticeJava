/*Part 2: Weight Guru Challenge
Create a Java program that tells whether your body to weight ratio is good or could be better.
The java app should take in your weight and height from the console and calculate your body to weight ratio.*/

package PracticeJava.Logic_Operator;
import java.util.Scanner;
public class BmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you weight (kg): ");
		double weight = sc.nextDouble();
		System.out.println("Enter you height (cm): ");
		double height = sc.nextDouble();
		double heightInMeters = height/100;
		double bodyWeight = weight/(heightInMeters*heightInMeters);
		if(bodyWeight<18.5) {
			System.out.println("UnderWeight, "+"Your Body Weight is: "+bodyWeight);
		}
		else if(bodyWeight<25) {
			System.out.println("Normal, "+"Your Body Weight is: "+bodyWeight);
		}
		else if(bodyWeight<30) {
			System.out.println("OverWeight, "+"Your Body WEight is: "+bodyWeight);
		}
		else {
			System.out.println("Obese");
		}
		sc.close();
	}

}
