package game;

import java.util.Scanner;

import board.Board;

public class Utilities {
	public static Person createPerson(Room[][] map) {
		System.out.print("Hi there adventurer, what is your name?");
		Scanner name=new Scanner(System.in);
		String p1name=name.next();
		Person p1=new Person();
		Board current=new Board(map);
		p1.Person(p1name,current.getDungMap());
		return p1;
	}
}
