package Access_Modefiers;

public class Type_1 
{
	public void addtion()
	{
		int a= 20,b=20;
		int sum= a+b;
		System.out.println(sum);
	}
	private static void Sub()
	{
		int a= 20,b=30;
		int sum1= a-b;
		System.out.println(sum1);
	}
	protected void mod()
	{
		int a= 20,b=110;
		int sum2= a%b;
		System.out.println(sum2);
	}
	

	public static void main(String[] args) {
		Type_1 aa =new Type_1();
		aa.addtion();
		Type_1.Sub();
		aa.mod();
		

	}

}
