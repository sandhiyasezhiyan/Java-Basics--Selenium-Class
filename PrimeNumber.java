package week1.dailytask1;

public class PrimeNumber {
	public static void main(String[] args) {
		int number=29;
		boolean flag=false;
		for(int i=2;i<=number/2;++i) {
			if(number%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not  a prime number");
		
	}

}
