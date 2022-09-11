package Khushi;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
	public static void main(String args[])
	{
		Random r = new Random();
		int a = r.nextInt(3);
		//System.out.println(a);
		
		System.out.println("0 for Rock \n1 for Paper \n2 for Scissor");
		System.out.print("\nEnter Your Choice : ");
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		
		if(b==a)
		{
			System.out.println("Draw");
		}
		else
		{
			if(b==0 && a==2 || b==1 && a==0 || b==2 && a==1)
			{
				System.out.println("You win!");
			}
			else
			{
				System.out.println("Computer win");
			}
		}
		
		if(a==0)
		{
			System.out.println("Computer choice : Rock");
		}
		else
		{
			if(a==1)
			{
				System.out.println("Computer choice : Paper");
			}
			else
			{
				System.out.println("Computer choice : Scissor");
			}
		}
	}

}
