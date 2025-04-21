package pjava;

public class ArmStrong {
	int num=471;
	
	int digit;
	int	length;              
 int digits(int x) {
while(x!=0) {
digit=x%10;
length++;
x/=10;
}
	return length;
}
 
	}


