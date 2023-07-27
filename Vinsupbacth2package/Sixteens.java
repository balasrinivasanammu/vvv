package Vinsupbacth2package;
import java.util.Scanner;

public class Sixteens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String myemail="ba@gmail.com",pwd="123456";
		
		String email=o.next();
		String password=o.next();
		
		if(email.equals(myemail) && password.equals(pwd))
		{
			System.out.println("Login successfully");
		}
		else
		{
			System.out.println("Login failed");
		}

	}

}
