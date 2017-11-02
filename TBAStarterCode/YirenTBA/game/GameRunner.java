package game;


import java.util.Scanner;
import game.Room;

public class GameRunner {

    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        /*for(int i=0;i<map.length;i++)
        {
        	for(int y=0;y<map[i].length;y++)
        	{	
        		map[i][y]= Room.Room(5,3);
        	}
        }
        */
        Dungeon cave = new Dungeon(map);

        boolean playing = true;
        Person player1 = Utilities.createPerson(map);
        
            System.out.println("Welcome to the Endless Cave of Doom, " + player1.getFirstName());
            while(playing)
            {
            player1.chooseMove();
            }
    }
}



