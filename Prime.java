import java.util.Scanner;
class Prime
{
		public static void main(String[] args)
		{
		int d=0;
		System.out.println("Please enter a number:");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		for(int j=1;j<=a;j++)
		{
			if(a%j==0)
				d++;
		}
		if(d==2)
			System.out.println("Prime");
		else 
			System.out.println("Composite");
		}
}