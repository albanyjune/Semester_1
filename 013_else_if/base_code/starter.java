import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc  = new Scanner(System.in);	
		Random rand = new Random();
		System.out.print("Enter a number between 0-1000 ");
		int f = sc.nextInt();
		int x = rand.nextInt(1001);
		
		
		boolean g = (x<f);
		if(g) {
			System.out.print("Sorry, the correct answer, " + x + " ,is smaller than " + f);
		}
		else if(x>f) {
			System.out.print("Sorry, the correct answer, " + x + " ,is larger than " +f);
		}
		else {
			System.out.print(x + "is equal to " + f);
		}
	
		
	}
}
