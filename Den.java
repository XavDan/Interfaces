
public class Den 
{

	public static void main(String[] args) 
	{
		DenMenu m1 = new DenMenu(10, "appetizer");
		//m1.setPrice(10);
		System.out.println(m1.getPrice());
		
		System.out.println();
		//m1.setType("Dinner");
		System.out.println(m1.getType());
		
		
		System.out.println("===================");
		
		Order o1 = new Order(100, "Burger");
		//o1.setCalorieCount(100);
		System.out.println(o1.getCalorieCount());
		
		System.out.println();
		//o1.setName("Burger");
		System.out.println(o1.getName());
		
		System.out.println("===================");
		
		DenMenuSpecial s1 = new DenMenuSpecial(50, " Entree");
		System.out.println(s1);
		//System.out.println(s1.getPrice());
		
		System.out.println("===================");
		
		SpecialOrder p1 = new SpecialOrder(500, "Pizza", 5);
		System.out.println(p1);
		

	}

}
