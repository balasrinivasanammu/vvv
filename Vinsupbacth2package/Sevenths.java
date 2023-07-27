package Vinsupbacth2package;
import java.util.Scanner;
public class Sevenths {

	public static void main(String[] args) {
		//int age=50;// compile time input
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=s.nextInt();
		if(age>25)
		{
			System.out.println("voter eligible");
		}
		else
		{
			System.out.println("voter not eligible");
		}
	}

}
