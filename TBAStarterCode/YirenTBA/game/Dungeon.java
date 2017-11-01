package game;

public class Dungeon {
	private Room[][] dungeonmap;
	public Dungeon(Room[][] map) {
		this.dungeonmap=map;
	}

	public void printMap() {
		for(int r=0; r<dungeonmap.length; r++) {
		       for(int c=0; c<dungeonmap[r].length; c++)
		           System.out.print(dungeonmap[r][c].getX() + " ");
		       System.out.println();
		    }
	}

}
