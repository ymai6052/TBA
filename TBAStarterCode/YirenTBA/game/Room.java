package game;

import java.util.Arrays;

public abstract class Room {

    private boolean[] doors;
    private Person[] occupants;
    private Item[] items;
    public String explored;
    private int x, y;

    public Room (int x, int y)
    {
    	this.x = x;
    	this.y = y;
    	this.explored="false";
    	/*
        this.doors = doors;
        this.occupants = occupants;
        this.items = items;
        
        */
    }
/*
    public  Person[] getOccupants() {
        return occupants;
    }

    public void setOccupants(Person[] occupants) {
        this.occupants = occupants;
    }

    
   
    

    public boolean[] getDoors()
    {
    	return doors;
    }
    */
    public void addOccupant(Person p)
    {
        this.occupants = Arrays.copyOf(this.occupants,this.occupants.length+1);
        this.occupants[this.occupants.length-1] = p;
        p.setRoom(this);
    }
    public int getX()
    {
    	return x;
    }
    
    public int getY()
    {
    	return y;
    }
	public void print() {

	}
}
