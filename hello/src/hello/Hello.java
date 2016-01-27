package hello;

public class Hello {

	public static void main(String [ ] args)
	{
		if(args[1] == null)
		{
			System.out.println("Hello World!!");
		}
		else
		{
			if(args[2] == null)
			{
				System.out.println("Hello " + args[1] + '!');
			}
			else
			{
				System.out.println("Hello " + args[1] + ". My name is " 
				+ args[2] + ". Hope you are doing well.");
			}
		}
	   
	}
}
