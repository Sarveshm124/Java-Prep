package practice;

public class Inheritance extends constructor
{
	Inheritance(){
		super('s');
		System.out.println("constructor call");
		
	}
	void f() {
		super.meth2();
	}
	public static void main(String args[])
	{
		Inheritance obj=new Inheritance();
				obj.calculation();
				obj.f();
	}

}
