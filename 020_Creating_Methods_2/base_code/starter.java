import java.util.Scanner;
import java.util.Random;

class starter {
	public static void pow(int a, int b){
		int x = a;
		int y = b;
		System.out.print(Math.pow(x,y));
		return;
		
	}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an integer ");
	int base = sc.nextInt();
	sc.nextLine();
	System.out.print("Enter another integer ");
	int exp = sc.nextInt();
	pow(base,exp);
	


		
	}
}
