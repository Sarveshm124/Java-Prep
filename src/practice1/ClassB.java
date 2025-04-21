package practice1;

public class ClassB {
	String empname;
	int Empid;
	String Empbranch;
	ClassB(String ename, int eId , String Ebranch){
		ename=empname;
		eId=Empid;
		Ebranch=Empbranch;
	}
	@Override
	public String toString(){
		return empname+" "+Empid+" "+Empbranch;
	}

}
