import java.util.Scanner;

/*****************************
Cross Pattern of Odd length words

Input : welcome

Output : 
w     e
 e   m
  l o  
   c
  l o
 e   m
w     e
*****************************/

public class crossPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int i,j;
		
		if(input.length()%2==1)
		{
			for(i=0;i<input.length();i++)
			{
				for(j=0;j<input.length();j++)
				{
					if(j == i)
						System.out.print(input.charAt(j));
					else if(j == input.length()-1-i)
						System.out.print(input.charAt(j));
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Enter a string with odd length");
		}
	}
}