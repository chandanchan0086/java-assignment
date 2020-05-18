package simple;

import java.util.Scanner;

//10.     Implement a JAVA program to find the distance using Pythagoras theorem.
//Formula :: Hypotenuse2 = Perpendicular2 + Base2
public class PythagorasTheorem {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of Base(a) and Perpendicular(b) length ::");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = (a*a) + (b*b);
		c = Math.sqrt(c);
		System.out.println("The length of Hypotenuse(c) is ::"+c);
		in.close();
	}

}
