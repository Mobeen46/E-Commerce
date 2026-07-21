package Method2;

public class MainClass 
{
	
	public static void main(String[] args) 
	{
		Calculator aa =new Calculator();
		int res1=aa.addition(8,4);
		System.out.println("This is add: "+res1);
		int res2=Calculator.Sub(8,4);
		System.out.println("This is sub: "+res2);
		int finalRes = aa.mul(res1, res2);
        System.out.println("This is final: "+finalRes);
		
		}
}
		



