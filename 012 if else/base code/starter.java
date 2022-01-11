import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter any number between 0-1000 ");
		int g = sc.nextInt();
		int x = rand.nextInt(1001);
		
		boolean y = (x==g);
		if(y)
		{
			System.out.print("That number was correct");
		}
		else
		{
			System.out.print("That number was incorrect, " + x + " was the actual number");
		}
		
	}
}
