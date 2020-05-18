package intermediate;
//2. Write a program that prints the sum of 3 numeric arguments taken from command line. 
public class SumCLA {

	public static void main(String[] args) {
		int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]);
		System.out.println("sum of 3 integer from command line is :: "+sum);
	}

}
