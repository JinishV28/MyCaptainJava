import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			
		int f1 = 0, f2 = 1, f3 = 1;
		for(int i = 0; i < n-1; i++)
		{
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.println(f1);
	}
}
