package Vinsupbacth2package;

public class Twentythrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=3;i++)//rows
		{
			for(int j=1;j<=i;j++)//cols
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=3;i++)//rows
		{
			for(int j=1;j<=i;j++)//cols
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		
		
		/*for(char i='a';i<='z';i++)//rows
		{
			for(char j='a';j<=i;j++)//cols
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		char i='a';
		while(i<='z')//rows
		{
			char j='a';
			while(j<=i)//cols
			{
				System.out.print(i+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		

	}

}
