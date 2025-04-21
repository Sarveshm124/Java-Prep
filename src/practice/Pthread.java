package practice;

public class Pthread extends Thread {
	@Override
	public void run() {
		System.out.println("run methed executed");
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}
	void method1() {
		System.out.println("hii");
	}

public static void main(String[] args) {
	
	Pthread obj=new Pthread();
	
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	t1.setName("first");

	
	t2.setName("Second");
    t1.start();
	t2.start();
	t1.setPriority(MAX_PRIORITY);
}
}
