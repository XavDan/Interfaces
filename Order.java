
public class Order implements Food
{
	private int calorieCount;
	private String name;
	
	public Order(){}
	
	public Order(int c, String n)
	{
		setCalorieCount(c);
		setName(n);
	}
	public void setCalorieCount(int c)
	{
		calorieCount = c;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int getCalorieCount()
	{
		return calorieCount;
	}
	
	public String getName()
	{
		return name;
	}
}
