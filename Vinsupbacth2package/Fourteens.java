package Vinsupbacth2package;

import java.util.Scanner;

public class Fourteens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a>b | a++<100);
		System.out.println(a);
		System.out.println(!(a>b | a++<100));
		

	}

}
