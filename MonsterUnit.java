import java.util.Scanner;
import java.util.ArrayList;

public class MonsterUnit extends BaseUnit
{

	private Item dropItem;
	

	
	public MonsterUnit()
	{
		this.name = "Monster1";
		this.age = 35;
		this.dropItem = new Item();
		
		
	}
	
	public void PrintStats()
	{
		System.out.println("");
		System.out.println("");
		System.out.println("******************************");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		System.out.println("Items:");
		System.out.println(dropItem.toString());
		System.out.println("******************************");
	}
	
}