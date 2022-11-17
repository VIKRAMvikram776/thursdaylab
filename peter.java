package Practice;

public class peter {
static void check(int option) throws userdefinedexception
{
if(option<3)
{
	throw new userdefinedexception("");
}
}
	public static void main(String[] args) {
		try
		{
			check(1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
