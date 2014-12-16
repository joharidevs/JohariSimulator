/*User.java
 *By Daniel Taylor
 *Created December 16, 2014
 */

public class User
{
	private int food;
    private int water;
    private int treats;
    private double money;
    
    public User()
    {
    	food = 10;
    	water = 10;
    	treats = 5;
    	money = 100;
    }
    
    public String itemIndex()
    {
    	return "Food:\t"+food+"\nWater:\t"+water+"\nTreats:\t"+treats+"\nMoney:\t"+money;
    }
    
    public String checkInput(String input)
    {
    	switch(input.toUpperCase())
    	{
    		case "I":
    			return this.itemIndex();
       	}
    	return "null";
    }
}/*User.java
 *By Daniel Taylor
 *Created December 16, 2014
 */


public class User
{
	private int food;
    private int water;
    private int treats;
    private double money;
    
    public User()
    {
    	food = 10;
    	water = 10;
    	treats = 5;
    	money = 100;
    }
    
    public String itemIndex()
    {
    	return "Food:\t"+food+"\nWater:\t"+water+"\nTreats:\t"+treats+"\nMoney:\t"+money;
    }
    
    public String checkInput(String input)
    {
    	switch(input.toUpperCase())
    	{
    		case "I":
    			return this.itemIndex();
       	}
    	return "null";
    }
}
