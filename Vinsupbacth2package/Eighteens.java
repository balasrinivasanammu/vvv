package Vinsupbacth2package;

public class Eighteens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=15;
		/*if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}*/
		int result=(a>b && a>c)?a:(b>c)?b:c;
		System.out.println(result);

	}

}
