import java.util.Scanner;

public abstract class BaseRoom
{
	String welcomeText;
	MonsterUnit monster;
	
	public void enter()
	{
		System.out.println(welcomeText);
		monster = new MonsterUnit();
		RoomMenu();
	}
	
	protected void RoomMenu()
	{
		char choice;
		String look = "1.\t Look Around";
		String wait = "2.\t Wait";
	
		Scanner scanner = new Scanner(System.in);
		System.out.println(look);
		System.out.println(wait);
		System.out.println();
		choice = scanner.next().charAt(0);
		
		switch (choice)
		{
			case '1':
				monster.PrintStats(); 
				RoomMenu();
			case '2':
				System.out.println("Waiting...");
				RoomMenu();
			default:
				RoomMenu();
		}
		
	}


}
