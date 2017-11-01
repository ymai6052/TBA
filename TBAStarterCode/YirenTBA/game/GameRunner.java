package game;


import java.util.Scanner;
import game.Room;

public class GameRunner {

    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for(int i=0;i<map.length;i++)
        {
        	for(int y=0;y<map[i].length;y++)
        	{	
        		map[i][y]= Room.Room(5,3);
        	}
        }
        Dungeon cave = new Dungeon(map);

        boolean onfloor = true;
        Person player1 = Utilities.createPerson(map);
        Scanner in = new Scanner(System.in);
        while(onfloor)
        {
        	
            System.out.println("Welcome to the Endless Cave of Doom, " + player1.getFirstName());
            cave.printMap();
            player1.printRoom();
            String move = player1.chooseMove();
            Utilities.movePlayer(cave, player1,move);
            
        }
		in.close();
    }
}



