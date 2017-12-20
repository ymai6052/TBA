package game;

public class vampire {
	private int health;
	private int attack;
	private String name;
	
	public vampire()
	{
		this.health=120;
		this.attack=5;
		this.name="vampire";
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
