package Garbage_collection;

public class Checked_exception_try_catch {
	

	public static void main(String[] args) 
	{
		System.out.println("first");
		try 
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("this");
		}
		System.out.println("secound");

	}

}
