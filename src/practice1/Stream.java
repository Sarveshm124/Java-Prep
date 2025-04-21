package practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Stream {
	void meth1() throws Exception {
		FileInputStream fis = new FileInputStream("D:\\documents\\text1.txt");
		int i;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
	}

	void meth2() throws Exception {
		FileOutputStream fos = new FileOutputStream("D:\\documents\\text2.txt");
		String msg = "hii I am here";
		byte arr[] = msg.getBytes();
		fos.write(arr);
		fos.close();
	}

	void meth3() throws Exception {
		FileInputStream fis = new FileInputStream("D:\\documents\\text1.txt");
		FileOutputStream fos = new FileOutputStream("D:\\documents\\text2.txt");
		int i;
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}
		fis.close();
		fos.close();
	}

	public static void main(String[] args) throws Exception {
		Stream obj = new Stream();
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}

}
