package game;

public class goblin implements monster{
	private int health;
	private int attack;
	private String name;
	
	public goblin()
	{
		this.health=100;
		this.attack=10;
		this.name="goblin";
	}
	
	public int getattack()
	{
		return this.attack;
	}
	public int gethealth()
	{
		return this.health;
	}
	public String getname()
	{
		return this.name;
	}
}
