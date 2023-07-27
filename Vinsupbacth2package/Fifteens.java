package Vinsupbacth2package;

import java.util.Scanner;

public class Fifteens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		int result=(a>b && a>c && a>d && a>e)?a:(b>c && b>d && b>e)?b:(c>d && c>e)?c:(d>e)?d:e;
		System.out.println(result);

	}

}
