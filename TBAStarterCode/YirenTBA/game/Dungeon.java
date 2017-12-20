package game;

public class Dungeon {
	private Room[][] dungeonmap;
	public Dungeon(Room[][] map) {
		this.dungeonmap=map;
		for(int r=0; r<dungeonmap.length; r++)
		       for(int c=0; c<dungeonmap[r].length; c++)
		    	   dungeonmap[r][c]=new Room(r,c);
		dungeonmap[0][0].explored=true;
	}

	public void printMap() {
		for(int r=0; r<dungeonmap.length; r++) {
		       for(int c=0; c<dungeonmap[r].length; c++)
		           System.out.print(dungeonmap[r][c].print() + " ");
		       System.out.println();
		    }
	}

}
