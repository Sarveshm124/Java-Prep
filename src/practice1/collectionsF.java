package practice1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class collectionsF {

//	ArrayLIst
	public void Arraylist() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(3, 40);
		al.add(80);
		al.add(90);

		Iterator<Integer> i = al.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println();

		al.remove(8);
		System.out.println(al);

		ArrayList<Integer> al2 = new ArrayList<Integer>();
//		Iterator<Integer> y = al2.iterator();
		al2.add(101);
		al2.add(102);
		al2.add(103);
		al2.add(104);
		System.out.println(al2);

		System.out.println(al2.contains(101));
		System.out.println(al.containsAll(al2));

		al.remove((Object) 80);
		System.out.println(al);

//		al2.clear();
		System.out.println(al2);

		al.addAll(al2);
		System.out.println(al);

		System.out.println(al.size());

		al.removeAll(al2);
		System.out.println(al);

		System.out.println(al.retainAll(al2));
		System.out.println(al);
		System.out.println();
		System.out.println();
	}

//ArrayList
	ArrayList<classA> arraylist2(int nums[], ArrayList<String> al1) {
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for (int i : nums) {
			al2.add(i);
		}
		System.out.println(al2);

		for (int j = 0; j <= al1.size() - 1; j++) {
			System.out.print(al1.get(j) + " ");
		}
		System.out.println();

		for (int g = al1.size() - 1; g >= 0; g--) {
			System.out.print(al1.get(g) + " ");
		}
		System.out.println();

		ArrayList<classA> al3 = new ArrayList<classA>();
		al3.add(new classA("saurabh", 605, "comp"));
		al3.add(new classA("khilesh", 606, "comp1"));
		al3.add(new classA("deepak", 607, "comp2"));
		al3.add(new classA("rushikesh", 608, "comp3"));
		al3.add(new classA("amar", 609, "comp4"));
		System.out.println();
		System.out.println();
		return al3;
	}

//Vector
	Vector<String> vectorp() {
		Vector<String> s = new Vector<String>();
		s.add("Sachin");
		s.add("Sehwag");
		s.add("Dhoni");
		s.add("Gambhir");
		s.add("Raina");

		Enumeration<String> r = s.elements();
		while (r.hasMoreElements()) {
			System.out.println(r.nextElement());
		}
		System.out.println();
		System.out.println();
		return s;
	}

//	LinkedList
	LinkedList<String> linkedlistp(ArrayList<Object> al, Vector<Integer> v) {
		LinkedList<ClassB> ll2 = new LinkedList<ClassB>();

//		ll2.addAll(0,al);
		ll2.add(new ClassB("saurabhB", 605, "comp"));
		ll2.add(new ClassB("khileshB", 606, "comp1"));
		ll2.add(new ClassB("deepakB", 607, "comp2"));
		ll2.add(new ClassB("rushikeshB", 608, "comp3"));
		ll2.add(new ClassB("amarB", 609, "comp4"));

		LinkedList<String> SS = new LinkedList<String>();
		SS.add("Sachin");
		SS.add("Sehwag");
		SS.add("Dhoni");
		SS.add("Gambhir");
		SS.add("Raina");

		for (int i = 0; i <= al.size() - 1; i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();

		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.print("{" + e.nextElement() + "}");
		}

		ListIterator<ClassB> L = ll2.listIterator();
		while (L.hasNext()) {
			System.out.println(L.next());
		}

		while (L.hasPrevious()) {
			System.out.println(L.previous());
		}
		return SS;
	}

//	Set(LinkedHashSet, TreaaSet, HashSet)
	void Set() {
		// linkedhashset
		// treeset
//		hashset

		HashSet<Object> hset = new HashSet<Object>();
		hset.add(34);
		hset.add(43);
		hset.add(65);
		hset.add(12);
		hset.add(2);

		LinkedHashSet<Object> LHS = new LinkedHashSet<Object>(hset);
		TreeSet<Object> TS = new TreeSet<Object>(hset);

		Iterator<Object> Io = hset.iterator();
		System.out.println("HashSet");
		while (Io.hasNext()) {
			System.out.print(Io.next() + " ");
		}
		System.out.println();

		Iterator<Object> lhso = LHS.iterator();
		Iterator<Object> tso = TS.iterator();
		System.out.println("LinkedHasSet");
		while (lhso.hasNext()) {
			System.out.print(lhso.next() + " ");
		}
		System.out.println();

		System.out.println("TreeSet");
		while (tso.hasNext()) {
			System.out.print(tso.next() + " ");
		}
		System.out.println();

		Iterator<Object> dtso = TS.descendingIterator();
		while (dtso.hasNext()) {
			System.out.print(dtso.next() + " ");
		}
		System.out.println();
	}

//	HasMap
	void mapp() {
		HashMap<Object, Object> HM = new HashMap<Object, Object>();
		HM.put(700, "JAVA");
		HM.put(100, "Python");
		HM.put(200, "CPP");
		HM.put(300, 'C');
		HM.put(400, 'R');
		HM.put(500, "Script");

//		System.out.println(HM);

		ArrayList<Object> ar = new ArrayList<Object>(HM.entrySet());
//		ArrayList<Object> ar=new ArrayList<Object>(HM.keySet());
//		ArrayList<Object> ar=new ArrayList<Object>(HM.valueSet());

		Iterator<Object> it = ar.iterator();
		while (it.hasNext()) {
//			System.out.println(it.next());
			Entry e = (Entry) it.next();
			System.out.println(e.getValue() + " " + e.getKey());
		}
	}

//	count the no of time a charachter is repeating in a string
	void assignment7() {
//		count the no of time a charachter is repeating in a string

		Scanner sc = new Scanner(System.in);
		System.out.println("type the String");
		String s=sc.next();
		HashMap<Character, Integer> repeatChar=new HashMap<Character, Integer>();
		for(char c:s.toCharArray()) {
			if(repeatChar.containsKey(c)) {
				repeatChar.put(c,(repeatChar.get(c)+1));
			}
			else {
				repeatChar.put(c, 1);
			}
		}
		ArrayList<Object> List=new ArrayList<Object>(repeatChar.entrySet());
		Iterator<Object> e=List.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
	}
	
	void hashtp() {
		Hashtable<Object, Object> HT = new Hashtable<Object, Object>();
		HT.put(700, "JAVA");
		HT.put(100, "Python");
		HT.put(200, "CPP");
		HT.put(300, 'C');
		HT.put(400, 'R');
		HT.put(500, "Script");
		
//		reverse the data in hashtable
		ArrayList <Object> ao=new ArrayList<Object>(HT.entrySet());
		ListIterator <Object> e=ao.listIterator(ao.size());
		while(e.hasPrevious()) {
			System.out.println(e.previous());
		}
		
//		passing the data in hashset
		
		HashSet<Object> ho=new HashSet<Object>(HT.entrySet());
		System.out.println(ho);
		
		while(e.hasNext()) {
			Entry l=(Entry) e.next();
			System.out.println(l.getKey()+" "+l.getValue());
		}
	}

	public static void main(String[] args) {

		collectionsF cf = new collectionsF();

//		cf.Arraylist(); 
//
//		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
//		ArrayList<String> s = new ArrayList<String>();
//		s.add("sarvesh");
//		s.add("jayant");
//		s.add("chandan");
//		s.add("akshay");
//		s.add("ashish");
//
////cf.arraylist2(a,s);
//		Iterator<classA> o = cf.arraylist2(a, s).iterator();
//		while (o.hasNext()) {
//			System.out.println(o.next() + " ");
//		}
//
//		Vector<String> E = cf.vectorp();
//		E.addAll(s);
//		System.out.println(E);
//
//// LinkedList P
//		ArrayList<Object> Al = new ArrayList<Object>();
//		Al.add("saurabh");
//		Al.add( 606);
//		Al.add(198);
//		Al.add(null);
//		Al.add(true);
//
//		Vector<Integer> I = new Vector<Integer>();
//		I.add(1000);
//		I.add(2000);
//		I.add(3000);
//		I.add(4000);
//		I.add(5000);
//
//		System.out.println(cf.linkedlistp(Al, I));
//		
//		
//		cf.Set();
//		cf.mapp();

//		cf.assignment7();
		
		cf.hashtp();
	}

}
