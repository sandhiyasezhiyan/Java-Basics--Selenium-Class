package week1.dailytask1;

public class Palindrome {
	public static void main(String[] args) {
	int  number=121,reverse=0,rem,temp;
	temp=number;
	while(temp!=0) {
		rem=temp%10;
		reverse=reverse*10+rem;
		temp/=10;
		};
		if(number==reverse)
			System.out.println("the number is palindrome");
		else
			System.out.println("the number is not a palindrome");
		
	}
		
	}


