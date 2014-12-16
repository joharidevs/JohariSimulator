/*Johari.java
 *By Daniel Taylor
 *Created October 31, 2014
 *Updated December 3, 2014
 *
 *Version 0.1 (Alpha)
 */
 
import java.util.Arrays;
 
public class Johari
{	
	private String name;
	private char gender;
	private int hunger;
	private int energy;
	private int health;
	private int level;
    
    public Johari(String newName, char newGender)
    {
    	name = newName;
    	gender = newGender;
    	hunger = 100;
    	energy = 100;
    	health = 100;
    	level = 1;
    	
    }
    public Johari()
    {
    	name = "Johari";
    	gender = 'm';
    	hunger = 100;
    	energy = 100;
    	health = 100;
    	level = 1;
    }
  //Stat HUD
	public String hud()
    {
    	String hungerBar = this.fillStatBar((int)hunger/10);
    	String energyBar = this.fillStatBar((int)energy/10);
    	String healthBar = this.fillStatBar((int)health/10);
    	return this.getName()+" (Level "+this.getLevel()+")\nHunger ["+hungerBar+"]\nEnergy ["+energyBar+"]\nHealth ["+healthBar+"]";
    }
    public String fillStatBar(int length)
    {
    	char[] filled = new char[length];
    		Arrays.fill(filled,'#');
    	char[] empty = new char[10-length];
    		Arrays.fill(empty,' ');
    	return new String(filled)+new String(empty);
    }
  //Statistics
    public String getName()
    {
    	return name;
    }
    
    public int getHunger()
    {
    	return hunger;
    }
    
    public int getEnergy()
    {
    	return energy;
    }
    
    public int getHealth()
    {
    	return health;
    }
    
    public int getLevel()
    {
    	return level;
    }
  //Stats Up
    public void levelUp()
    {
    	level++;
    }
    
    public void feed(int value)
    {
    	hunger+=value;
    }
    
    public void sleep(int value)
    {
    	energy+=value;
    }
    
    public void heal(int value)
    {
    	health+=value;
    }
}
