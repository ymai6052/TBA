package game;


import java.util.Scanner;
import game.Room;

public class GameRunner {

    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        Dungeon cave = new Dungeon(map);
        cave.printMap();
        boolean playing = true;
        Person player1 = Utilities.createPerson(map);
        
            System.out.println("Welcome to the Endless Cave of Doom, " + player1.getFirstName());
            while(playing)
            {
            	cave.printMap();
            	player1.chooseMove();
            }
    }
}



