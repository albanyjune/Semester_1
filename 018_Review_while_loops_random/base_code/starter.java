import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.print("Guess a number! ");
	int guess = sc.nextInt();
	int secret = rand.nextInt(1000);
	while(guess!=secret) {
		System.out.print("Sorry, that's the wrong number. Please guess again.");
		int guess2 = sc.nextInt();
		if (guess2==secret){
			break;
		}
	}
	System.out.print("Congradulations, you guessed the right number!");


		
	}
}
