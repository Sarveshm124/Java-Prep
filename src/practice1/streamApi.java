package practice1;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi {
void meth1() {
	LinkedHashSet<Integer> al=new LinkedHashSet<Integer>();
//	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(110);
	al.add(30);
	al.add(20);
	al.add(60);
	
	
//	Collections.sort(al);
	Stream <Integer> s=al.stream().sorted();
	List<Integer> li=s.collect(Collectors.toList());
	System.out.println(li);
}
	public static void main(String[] args) {
		new streamApi().meth1();
	}

}
