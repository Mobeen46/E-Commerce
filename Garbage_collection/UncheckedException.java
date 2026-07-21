package Garbage_collection;

public class UncheckedException {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("Stated");
		try
		{
			Thread.sleep(2000);
			int sas=20;
			int kak=20;
			int dad= sas/kak;
			System.out.println("this is clalculating :"+dad);
		}
		catch(ArithmeticException e)
		{
			System.out.println("gaga");
		}
		System.out.println("completed");

	}

}
