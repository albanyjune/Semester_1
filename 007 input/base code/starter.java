import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.print("What is your first name?");
	String text = sc.nextLine();
	
	System.out.print("How old are you?");
	int number = sc.nextInt();
	sc.nextLine();
	
	
	System.out.print("When is your birth month?");
	String x = sc.nextLine();
	
	System.out.print("When is your birthday?");
	String z = sc.nextLine();
	
	System.out.print("When is your birth year?");
	String w = sc.nextLine();
	
	System.out.print("How much is a buck fifty?");
	double t = sc.nextDouble();
	
	System.out.print("My first name is ");
	System.out.println(text);
	System.out.print("I am ");
	System.out.println(number);
	System.out.print("I was born in ");
	System.out.println(x);
	System.out.print("I was born on ");
	System.out.println(z);
	System.out.print("I was born in ");
	System.out.println(w);
	System.out.print("A buck fifty is $ ");
	System.out.println(t);
	}
}
