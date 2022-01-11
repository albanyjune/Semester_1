import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name? ");
		String z = sc.nextLine();
		System.out.print("What is your title? ");
		String v = sc.nextLine();
		System.out.print("Would you like to be a Warrior, Wizard, or a Rogue? ");
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
			System.out.println("You've chosen Warrior! For honor!");
		}
		else if((a).equals(d) || (g)) {
			System.out.println("You've chosen Rogue! How Cunning!");
		}
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely. ");
		System.out.print("Strength 1-10. Please input a smaller value. ");
		int h = sc.nextInt();
		int strength = 25-h;
		
		System.out.println("You have " + strength + " points left");
		System.out.print("Dexterity 1-10. Please input a smaller value. ");
		int t = sc.nextInt();
		int dex = strength-t;
		System.out.println("You have " + dex + " points left");
	
		System.out.print("Intelligence 1-10. Please input a smaller value. ");
		int j = sc.nextInt();
		
		int intelligence = dex-j;
		System.out.println("You have " + intelligence + " points left");
		System.out.print("Constitution 1-10. Please input a smaller value. ");
		int i = sc.nextInt();
		
		int constitution = intelligence-i;
		System.out.println("You have " + constitution + " points left");
		System.out.print("Charisma 1-10. Please input a smaller value. ");
		int p = sc.nextInt();
		
		int charisma = constitution-p;
		System.out.println("You have "+ charisma + " points left");
		System.out.println("You have " + charisma + " points to spend for next time.");
		System.out.println("You are " + z + ", the " + v + " of CVHS.");
	
		System.out.println("You are a " + a + " with the following stats!");
		
		System.out.println("Strength - " + h);
		System.out.println("Dexterity - "+t);
		System.out.println("Intelligence - " + j);
		System.out.println("Constitution - " + i);
		System.out.println("Charisma - " + p);
		System.out.println("Good luck on your quest!");
		
	}
}
