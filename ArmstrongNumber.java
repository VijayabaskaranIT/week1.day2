package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input=153;
		int remainder,original,calculated=0;
		original=input;
		while(input>0) {
			remainder=input%10;
			calculated=calculated+(remainder*remainder*remainder);
			input=input/10;
		}
		if(calculated == original)
			System.out.println("Given number is Armstrong");
		else
			System.out.println("Given number is not Armstrong");
	}

}