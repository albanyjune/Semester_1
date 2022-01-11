import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a){
	String x = a;
	return ;
	}
	public static void toStringcombined(String a,String b){
	String y = b;
	String x = a;
	
	System.out.println(x + y);
	System.out.println("This is using methods!");
	return;
	
	
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a sentence!");
		
		String sen = sc.nextLine();
		toString(sen);
		
		System.out.println("Write another sentence!");
		String sen2 = sc.nextLine();
		
		toStringcombined(sen, sen2);
		
	}
}
