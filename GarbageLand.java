import java.util.*;
import java.io.*;

public class GarbageLand
{

	public static void main(String args[])
	{
		System.out.println("\n\n\n");
		ExplorerUnit myExplorer = new ExplorerUnit();
		myExplorer.PrintStats();
		System.out.println(myExplorer.name);
		new Game();
		
		
	}
	

}	