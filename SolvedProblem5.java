package tamilnadu.chennai;

public class SolvedProblem5 {
	public static void main(String[] args) {
		SolvedProblem5 S1 = new SolvedProblem5();
		//S1.strongNumber();
		//S1.neonNumber();
		//S1.perfectNumber();
		S1.swap();
	}

	private void swap() {
		// TODO Auto-generated method stub
		int a= 5;
		int b=6;
		int temp;
		temp=b;
		b=a;
		a=temp;
		System.out.println(" a"+a+" "+" b"+b);
		
	}

	private void perfectNumber() {
		// TODO Auto-generated method stub
		int number=6;
		int factor=1;
		int total=0;
		while(factor<number) {
			if(number%factor==0)
			{
			total=total+ factor;
			}
			factor++;
			
			
		}
		if(number==total)
			System.out.println("It is a perfect number");
		else
			System.out.println("It is not a perfect number");
		
	}

	private void neonNumber() {
		// TODO Auto-generated method stub
		int number=9;
		int square= number*number;
		int remainder=0;
		while(square>0)
		{
			remainder=remainder+square%10;
			square=square/10;
		}
		if(remainder==number)
		{
			System.out.println("It is neon number");
		}
		
		else
		{
			System.out.println("It is not neon number");
		}
	}

	private void strongNumber() {
		// TODO Auto-generated method stub
		int number = 145;
		int number2 = number;
		int total = 0;
		int remainder = 1;
		int strong = 0;
		while (number > 0) {
			int fact = 1;
			remainder = number % 10;
			total = remainder;
			while (fact < remainder) {
				total = total * fact;
				fact++;
			}
			strong = strong + total;
			number = number / 10;
		}
		if (strong == number2) {
			System.out.println("given number is strong");
		} else {
			System.out.println("it is not strong number");
		}

	}

}
