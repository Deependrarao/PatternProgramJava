package homeexericise24;

public class Hollow 
{
public static void main(String[] args) 
{
	//nested for loop
	for(int i=1;i<=5;i++) //outer for loop-> represents no. of rows
	{
		for(int j=1;j<=i;j++) //inner for loop-> represents no. of columns
		{
			if(j==1||i==5|| i==j)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
}
}
