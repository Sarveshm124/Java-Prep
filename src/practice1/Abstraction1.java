package practice1;

public class Abstraction1 extends abstraction {
	int meth1() {
		System.out.println("this is abstraction");
		return 50;
}
	void meth2(int s) {
		System.out.println(this.meth1() + 2);
	}
 public static void main(String[] args) {
	 {
		abstraction obj= new Abstraction1();
		obj.meth1();
		obj.meth2(54);
	 }
}
}
