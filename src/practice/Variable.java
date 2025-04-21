package practice;

public class Variable {
	static String hospitalName="Rythem";
	String patientName;
	int bedNo;
	
	Variable( String PName , int BNo){
		
		patientName=PName;
		bedNo=BNo;
	}

	public static void main(String[] args) {
		
		Variable obj =new Variable("satish",43);
		Variable obj1 =new Variable("aatish",47);
		Variable obj2 =new Variable("latish",48);
		
		System.out.println(obj.hospitalName+" "+obj.patientName+" "+obj.bedNo);
		System.out.println(obj1.hospitalName+" "+obj1.patientName+" "+obj1.bedNo);
		System.out.println(obj2.hospitalName+" "+obj2.patientName+" "+obj2.bedNo);
		
		hospitalName="LifeCare";

		Variable obj3 =new Variable("Kishor",73);
		Variable obj4 =new Variable("Makar",77);
		Variable obj5 =new Variable("Haresh",78);
		
		System.out.println(obj3.hospitalName+" "+obj3.patientName+" "+obj3.bedNo);
		System.out.println(obj4.hospitalName+" "+obj4.patientName+" "+obj4.bedNo);
		System.out.println(obj5.hospitalName+" "+obj5.patientName+" "+obj5.bedNo);

	}

}
