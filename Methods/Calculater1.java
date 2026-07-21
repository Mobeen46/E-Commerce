package Methods;

public class Calculater1 
{   // instace
	public void addition()
	{
		int a=20,b=20;
		int sum = a+b;
		System.out.println("this is add:"+  sum);
	}    //Static
	public static void Subtraction()
	{
		int a=20, b=30;
		int sum1 = a-b;
		System.out.println("this in sub :"+sum1);
	}
	
	// accessspecifire returtype methodname(parameter_list)
	public static void main(String[] args) 
	{    
		Calculater1 aa= new Calculater1();
		aa.addition();
		Calculater1.Subtraction();

	}
}
