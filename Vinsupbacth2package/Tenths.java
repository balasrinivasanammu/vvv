package Vinsupbacth2package;

import java.util.Scanner;

public class Tenths {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a value:");
		int a=s.nextInt();
		System.out.println("Enter the b value:");
		int b=s.nextInt();
		boolean result1=a>b;
		System.out.println("The result:"+result1);
		boolean result2=a<b;
		System.out.println("The result:"+result2);
		boolean result3=a>=b;
		System.out.println("The result:"+result3);
		boolean result4=a<=b;
		System.out.println("The result:"+result4);
		boolean result5=a==b;
		System.out.println("The result:"+result5);

	}

}
