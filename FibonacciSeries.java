package week1.dailytask1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int number=8,firstterm=0,secondterm=1;
		System.out.println("the giver of fibonacci series is:"+number);
		for(int i=1;i<=number;++i) {
			System.out.println(firstterm);
			int nexterm = firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nexterm;
		}
	}

}
