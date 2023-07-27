package Vinsupbacth2package;
import java.util.Arrays;
import java.util.Scanner;
public class Twentys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=5;
		for(;;i++)
		{
			System.out.println("Hello Selvam "+i);
		}*/
		
		/*char name[]= {'z','a','u'};
		Arrays.sort(name);
		System.out.println(name);*/
		
		/*for(int i=20;i>=10;i--)
		{
			System.out.println(i);
		}*/
		
		/*for(int i=25;i<=50;i=i+10)
		{
			System.out.println(i);
		}*/
		int maxwd=30000;
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			if(i<=3)
			{
				System.out.println("Enter the amount:");
				int amount=s.nextInt();
				if(amount<maxwd)
				{
					maxwd=maxwd-amount;
					System.out.println("Min balance="+maxwd);	
				}
				else
				{
					System.out.println("Insufficient amount");
					break;
				}
			}
		}
	}

}
