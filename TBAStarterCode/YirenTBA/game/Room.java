package game;

import java.util.Arrays;

public class Room {

    private boolean[] doors;
    private Person[] occupants;
    private Item[] items;
    public boolean explored;
    private int x, y;

    public Room (int x, int y)
    {
    	this.x = x;
    	this.y = y;
    	this.explored=false;
    }
    
    public int getX()
    {
    	return x;
    }
    
    public int getY()
    {
    	return y;
    }
	public int print() {
		if(this.explored==false)
		{
			return 0;
		}
		return 1;
	}
}
