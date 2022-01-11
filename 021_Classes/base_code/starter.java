import java.util.Scanner;
import java.util.Random;
class Character{
	String type = new String("Wizard");
	int Strength = 9;
	int Dexterity = 4;
	int Intelligence = 6;
	int Constitution = 3;
	int Charisma = 6;
	
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Character myCharacter = new Character();
	System.out.println("Your role is " + myCharacter.type);
	System.out.println("Your strength trait is " + myCharacter.Strength);
	System.out.println("Your dexterity trait is " + myCharacter.Dexterity);
	System.out.println("Your intelligence trait is " + myCharacter.Intelligence);
	System.out.println("Your constitution trait is " + myCharacter.Constitution);
	System.out.println("Your charisma trait is" + myCharacter.Charisma);
		
	}
}
