package game;

import items.Item;
import rooms.*;
import people.Person;

import java.util.Scanner;

public class GameRunner {

    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length;i++)
            {
                boolean[] doors = {true,true,true,true};
                Person[] people = {};
                Item[] items = {};
            }

        }

        Dungeon cave = new Dungeon(map);

        boolean gameOn = true;
        Person player1 = Utilities.createPerson();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
        	
            System.out.println("Welcome to the Endless Cave of Doom, " + player1.getFirstName(in.next()));
            cave.printMap();
            player1.printRoom();
            String move = player1.chooseMove();
            Utilities.movePlayer(cave, player1,move);

        }
		in.close();
    }
}



