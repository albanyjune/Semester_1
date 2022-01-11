import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number g=");
		int g = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter a 2nd number h=");
		int h = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter a 3rd number i=");
		int i = sc.nextInt();
		if((g>h) && (g>i)) {
			System.out.println("g is the greatest number");
		}
		if((h>i) && (h>g)) {
			System.out.println("h is the greatest number");
		}
		if((i>g) && (i>h)) {
			System.out.println("i is the greastest number");
		}
		if((i<g) && (i<h)) {
			System.out.println("i is the smallest number");
		}
		if((g<i) && (g<h)) {
			System.out.println("g is the smallest number");
		}
		if((h<i) && (h<g)) {
			System.out.println("h is the smallest number");
		}	
	}
}
