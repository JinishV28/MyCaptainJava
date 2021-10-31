import java.util.*;
public class matrices 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{2,3,4},{5,6,7},{8,9,10}};
		System.out.println("Enter 1.Addition,2.Multiplication");
		int ch = sc.nextInt();
		int i,j,k;
		int c[][] = new int[3][3];
		switch(ch)
		{
		case 1:
		{
			System.out.println("Addition");
			for(i=0;i<=2;i++)
			{
				for(j=0;j<=2;j++)
				{
					System.out.print(a[i][j]+b[i][j]+" ");
				}
			}
			break;
		}
		case 2:
		{
			System.out.println("Multiplication");
			for(i=0;i<=2;i++)
			{
				for(j=0;j<=2;j++)
				{
					for(k=0;k<=2;k++)
					{
						c[i][j] += a[i][k]*b[k][j];
					}
					System.out.print(c[i][j]+" ");
				}
			}
			break;
		}
		default:
		{
			System.out.println("Invalid Option");
		}
		}
	}
}
