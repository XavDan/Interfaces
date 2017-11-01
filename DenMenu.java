//weekly menu, special menu inherited
//array of objects for items on menu, possibly field from order object?
//see if implemented interfaces carry through inheritance
public class DenMenu implements Menu
{
	private int price;
	private String type;
	
	public DenMenu(){}
	
	public DenMenu(int p, String t)
	{
		setPrice(p);
		setType(t);
	}
	
	public void setPrice(int p)
	{
		price = p;
	}
	
	public void setType(String t)
	{
		type = t;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String getType()
	{
		return type;
	}
	
}
