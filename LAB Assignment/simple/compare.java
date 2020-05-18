package simple;
//2. Define a two variables a and b, and using assertion check whether they are same or not. 
public class compare {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		if(a==b)
		{
			System.out.println("A is Equal to B");
		}
		else
		{
			assert(a==b);
			System.out.println("A is Not Equal to B");
		}
	}

}
