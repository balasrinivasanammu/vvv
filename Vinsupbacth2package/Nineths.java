package Vinsupbacth2package;
import java.util.Scanner;
public class Nineths {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a value:");
		int a=s.nextInt();
		System.out.println("Enter the b value:");
		int b=s.nextInt();
		int result1=a+b;
		System.out.println("The result:"+result1);
		int result2=a-b;
		System.out.println("The result:"+result2);
		int result3=a*b;
		System.out.println("The result:"+result3);
		float result4=(float)a/(float)b;
		System.out.println("The result:"+result4);
		int result5=a%b;
		System.out.println("The result:"+result5);
	}
}
