package demo0_scope;

public class A 
{

	int x;

	public A() 
	{
		x = 5;
	}
	public static void main(String[] args) 
	{
		A a = new A();
		A b = new A();
		a.x++;
		b.f();
		S.g();//不用宣告直接用
	}
	void f() 
	{
		x--;
	}
	
}
class S {
	static void g() 
	{
		System.out.println("ya");//生命週期和程式一樣長
	}
}