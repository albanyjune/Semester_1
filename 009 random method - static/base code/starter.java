import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int x_num1 = rand.nextInt(10);
		System.out.println(x_num1);
		
		int y_num2 = rand.nextInt(100)+1;
		System.out.println(y_num2);
		
		double f_num3 = rand.nextDouble() + 2.5;
		System.out.println(f_num3);
		
		double g_num4 = rand.nextDouble() + rand.nextInt(575) + 14;
		System.out.println(g_num4);
		
		
	}
}
