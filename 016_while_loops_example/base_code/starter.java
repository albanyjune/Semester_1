import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your name ");
	String name = sc.nextLine();
	System.out.print("How many times would you want your name to written? ");
	int times = sc.nextInt();
	sc.nextLine();
	int count = 0;
	while (count!=times){
		System.out.println(name);
		if(count==times){
			break;
		}
		count = count + 1;
	}


		
	}
}
