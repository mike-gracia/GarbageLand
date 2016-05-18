import java.util.Scanner;
import java.util.ArrayList;

public class ExplorerUnit extends BaseUnit
{


	final int itemSpace = 15;
	private ArrayList<Item> items = new ArrayList<>();
	

	public ExplorerUnit(String _name, int _age )
	{
		name = _name;
		age = _age;
	}
	
	public ExplorerUnit()
	{
		GetExplorerInfo();
		items.add(new Item("Key", "Unlocks a door", 1));
		
	}
	
	//recursive
	//gets explorer info from user
	public void GetExplorerInfo()
	{
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("What is your name?");
		name = scanner.next();
		System.out.print("How old are you?");
		age = scanner.nextInt();
		
		PrintStats();
		
		System.out.print("Is this correct Y/N?");
		switch(scanner.next())
		{
			case "Y":
			case "y":
				System.out.println("Welcome " + name + "!");
				break;
			case "N":
			case "n":
			default:
				GetExplorerInfo();
		}
			
	}
	
	public void PrintStats()
	{
		System.out.println("");
		System.out.println("");
		System.out.println("******************************");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		System.out.println("Items:");
		for(Item item : items)
		{
			System.out.println("\t" + item.toString());
		}
		System.out.println("******************************");
	}
	
}