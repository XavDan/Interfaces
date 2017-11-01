//implement not throwing errors without methods- in parent or child

//REDUNDANT
//if implements only in child, and methods are in parent, it works. 
//
public class DenMenuSpecial extends DenMenu //implements Menu //REDUNDANT
{
	
	private String[] meals = new String[5];
	
	public DenMenuSpecial(int p, String t)
	{
		super.setPrice(p);
		super.setType(t);
		meals[0] = "Chicken";
		meals[1] = "Beef";
		meals[2] = "Fish";
		meals[3] = "Salad";
		meals[4] = "Pasta";
	}
	
	public String toString()
	{
		String a = "";
		for(int counter = 0; counter < meals.length; counter ++)
		{
			a += meals[counter] + "\n";
		}
		return a;
	}
	
	
}
