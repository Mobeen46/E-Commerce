package Garbage_collection;

public class Garbage_collection_pract_1 
{
	public void finalize()
	{
		System.out.println("edefwf");

	}

	public static void main(String[] args) {
		Garbage_collection_pract_1 aa= new Garbage_collection_pract_1();
		Garbage_collection_pract_1 aa1= new Garbage_collection_pract_1();
		Garbage_collection_pract_1 aa2= new Garbage_collection_pract_1();
		
		new Garbage_collection_pract_1();
		
		aa =null;
		aa1 = aa2;
		System.gc();

	}

}
