import java.util.Scanner;

public class Game		//rename game?
{

	
	

	public Game()
	{
		MainMenu();
	}
	
	public void MainMenu()
	{
	
		String start = "1.\t Start";
		String settings = "2.\t Settings";
		String quit = "4.\t Quit";
	
		char choice;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println(start);
		System.out.println(quit);
		choice = scanner.next().charAt(0);
		
		switch (choice)
		{
			case '1':
			start(); break;
			case '4':
			System.exit(0);
			default:
			MainMenu();
		}
	}
	
	
	
	public void start()
	{
		System.out.println("In the beginning there was trash...\n\n\n");
		RoomRegular currentRoom = new RoomRegular();
		currentRoom.enter();
	}
}