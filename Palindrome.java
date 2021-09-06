package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int n=454;
		int r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			}
		if(sum == temp)
			System.out.println("The palindrome of the number is: "+temp);
		else
			System.out.println("the number is not a palindrome");
	}

}
