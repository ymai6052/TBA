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

	public void printdungeon(int xpos, int ypos) {
		for(int i=0; i<10;i++)
		{
			if(i==xpos)
			{
				for(int y=0;y<10;y++)
				{
					if(y==ypos)
					{
						System.out.print("1 ");
						y++;
					}
					if(y<10)
					{
					System.out.print("0 ");
					}
				}
			}
			else
				for(int y=0;y<10;y++)
				{
					System.out.print("0 ");
				}
		System.out.println();
		}
	}

	public void chooseMove() {
		System.out.println("Would you like to go up, down, left or right?");
		Scanner movement=new Scanner(System.in);
		String move=movement.next();
		if(move.equals("left")) 
		{
			currentroom[1]+=-1;
			System.out.println("you moved left");
			if(currentroom[1]<0)
			{
				currentroom[1]+=+1;
				System.out.print("you hit a wall going left.");
			}
		}
		if(move.equals("right")) {
			currentroom[1]+=+1;
			System.out.println("you moved right");
			if(currentroom[1]>10)
			{
				currentroom[1]+=-1;
				System.out.print("you hit a wall going right.");
			}
		}
		if(move.equals("down")) {
			currentroom[0]+=+1;
			System.out.println("you moved down");
			if(currentroom[0]>10)
			{
				currentroom[0]+=-1;
				System.out.print("you hit a wall going down.");
			}
		}
		if(move.equals("up")) {
			currentroom[0]+=-1;
			System.out.println("you moved up");
			if(currentroom[0]<0)
			{
				currentroom[0]+=1;
				System.out.print("you hit a wall going up.");
			}
		}
		System.out.print("x= "+currentroom[0]+" y= "+currentroom[1]);
		System.out.println();
		printdungeon(currentroom[0],currentroom[1]);
	}
	public String getFirstName() {
		return name;
	}
}
