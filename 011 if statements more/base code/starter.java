import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter another number ");
		int y = sc.nextInt();
		sc.nextLine();
		
		boolean j = x!=y;
		if(j)
		{
			System.out.println("those two values were not equal");
		}
		else {
			System.out.println("those two values were equal");
		}
		
		
	}
}
