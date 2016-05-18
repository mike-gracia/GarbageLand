
public class Item
{

	private String name;
	private String description;
	private int value;
	private int Uid;
	
	

	public Item()
	{
		name = "empty";
		description = "null string";
		value = 0;	
	}
	
	
	public Item(String _name, String _description, int _value)
	{
		name = _name;
		description = _description;
		value = _value;
	}
	
	public String toString()
	{
			return	  name + " "
					+ description + " "
					+ value;
	}	
	

}
	