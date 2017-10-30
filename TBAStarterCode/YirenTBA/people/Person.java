package people;

import rooms.Room;
import java.util.Scanner;
public class Person {
	private String name;
	private Room[][] currentroom;
	public void Person(String pname,Room[][] room)
	{
		this.name=pname;
		this.currentroom=room;
	}
	public void setRoom(Room room) {
		
	}

	public void printRoom() {
		
		
	}

	public String chooseMove() {
		System.out.println("Would you like to go up, down, left or right?");
		Scanner movement=new Scanner(System.in);
		String move=movement.next();
		return move;
	}

	public String getFirstName(String name) {
		return name;
	}
}
