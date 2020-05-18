package JavaIO;
import java.io.File;
import java.util.Scanner;  
public class csvReader  
{  
public static void main(String[] args) throws Exception  
{
Scanner sc = new Scanner(new File("C:\\\\Users\\\\Chandan\\\\eclipse-workspace\\\\Assignment_quarintine\\\\src\\\\JavaIO\\\\output files\\\\csvExample.csv"));  
sc.useDelimiter(","); 
while (sc.hasNext())
{  
System.out.print(sc.next());
}   
sc.close();
}  
}  