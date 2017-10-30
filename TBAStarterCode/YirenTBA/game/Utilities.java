package game;

import people.Person;
import rooms.Room;
import board.Board;
import java.util.Scanner;

public class Utilities {
	public static Person createPerson() {
		System.out.print("Hi there adventurer, what is your name?");
		Scanner name=new Scanner(System.in);
		String p1name=name.next();
		Person p1=new Person();
		Board current=new Board(null);
		p1.Person(p1name,current.getDungMap());
		return p1;
	}

	public Room[][] getposition()
	{
		
	}
	public static void movePlayer(Dungeon dung, Person player1, String move) {
		
	}

}
