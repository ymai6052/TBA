package game;

import java.util.Scanner;
public class Person {
	private String name;
	private int[] currentroom;
	public void Person(String pname)
	{
		this.name=pname;
		this.currentroom=new int[] {0,0};
	}

	public void printRoom() {
		
		
	}

	public void chooseMove() {
		System.out.println("Would you like to go up, down, left or right?");
		Scanner movement=new Scanner(System.in);
		String move=movement.next();
		switch(move)
		{
		case "left":
			currentroom[0]+=-1;
		case "right":
			currentroom[0]+=1;
		case "down":
			currentroom[1]+=-1;
		case "up":
			currentroom[1]+=1;
		}
	}

	public String getFirstName() {
		return name;
	}
}
