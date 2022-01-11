import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to be a Warrior, a Wizard, or a Rogue? ");
		String a = sc.nextLine();
		String b = new String("wizard");
		String c = new String("warrior");
		String d = new String("rogue");
		boolean e = (a.equals("Wizard"));
		boolean f = (a.equals("Warrior"));
		boolean g = (a.equals("Rogue"));
	
		if ((a).equals(b) || (e)) {
			System.out.println("You've chosen Wizard! Excelisor!");
		}
		else if((a).equals(c) || (f)) {
			System.out.print("You've chosen Warrior! For honor!");
		}
		else if((a).equals(d) || (g)) {
			System.out.print("You've chosen Rogue! How Cunning!");
		}
			
		
		
	}
}
