package game;

import people.Person;
import java.util.Scanner;
public class Utilities {
	public static String personname;
	public static Person createPerson() {
		Scanner name=new Scanner(System.in);
		personname=name.next();
		return personname;
	}

	public static void movePlayer(School tech, Person player1, String move) {
		// TODO Auto-generated method stub
		
	}

}
