
public class SpecialOrder extends Order //implements Food //REDUNDANT
{
	private int numMeal;
	
	public SpecialOrder(int c, String n, int m)
	{
		setCalorieCount(c);
		setName(n);
		numMeal = m;
	}
	
	public String toString()
	{
		return getCalorieCount() + "\n" + getName() + "\n" + numMeal;
	}
	
//
	
	
}
