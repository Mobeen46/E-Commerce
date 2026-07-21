package Methods;

public class combine_all 
{ 
	public void add()
	{
		int a=10,b=20;
		int sum =a+b;
		System.out.println(sum);
	}
	public static void sub(int a,int b)
	{
		int sum1=a-b;
		
		System.out.println(sum1);
	}
	public static int mul()
	{
		int a=20,b=30;
		int sum2 = a*b;
		return sum2;
	}
	public double div(double a,double b) 
	{
		double div=a/b;
		return div;
	}

	public static void main(String[] args) {
		WOR_WOP aa=new WOR_WOP();
		System.out.println("first:");
		aa.add();
		System.out.println("sec");
		WOR_WP.sub(20, 10);
		System.out.println("third");
		WR_WOP cc= new WR_WOP();
		System.out.println(cc.mul());
		System.out.println("FOUR");
		WR_WP dd= new WR_WP();
		System.out.println(dd.div(2, 2));

	}

}
