package practice1;

public class classA {
	String empName;
	int empId;
	String empDept;
	classA(String empName, int empId, String empDept)
	{
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
	}
	@Override
	public String toString() {
		return empName+" "+empId+" "+empDept;
	}

}
