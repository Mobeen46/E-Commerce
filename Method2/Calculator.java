package Method2;

public class Calculator 
{
	public int addition(int a, int b)
	{
		int sum= a+b;
		return sum;
	}
	public static int Sub(int a, int b)
	{
		int sum1= a-b;
		return sum1;
		
	}
	public int mul(int a, int b)
	{
		int sum2= a*b;
		return sum2;
	}
	public int div(int a, int b)
	{
		int sum2= a/b;
		return sum2;
		
	}
		public static void main(String[] args) {
		Calculator aa =new Calculator();
		aa.addition(20, 10);
		Calculator.Sub(10,20);
		aa.mul(22,44);
		aa.div(45, 35);
		
	}
		

}
