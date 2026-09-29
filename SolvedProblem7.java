package tamilnadu.chennai;

public class SolvedProblem7 {
	
	public static void main(String[] args) {
		SolvedProblem7 S1 = new SolvedProblem7();
		//S1.reverseNumber();
		//S1.printNumbers();
		//S1.printEvenNumbers();
		//S1.sumofNumbers();
		//S1.factorialNumber();
		S1.countDigits();
	}
	

	private void countDigits() {
		// TODO Auto-generated method stub
		int n=123456;
		int count=0;
		while(n>0)
		{
			n=n/10;
			System.out.println(n);
			count++;
		}
		System.out.println(count);
		
	}


	private void factorialNumber() {
		// TODO Auto-generated method stub
		int n=5;
		int temp=1;
		while(n>0)
		{
			temp=temp*n;
			n--;
		}
		System.out.println(temp);
		
	}


	private void sumofNumbers() {
		// TODO Auto-generated method stub
		int n = 100;
		int temp=0;
		while(n>0)
		{
			temp=temp+n;
			n--;
			
		}
		System.out.println(temp);
	}


	private void printEvenNumbers() {
		// TODO Auto-generated method stub
		int n=1;
		while(n<=100)
		{
			if(n%2==0)
				System.out.println(n);
			
		n++;
		}
		
	}


	private void printNumbers() {
		// TODO Auto-generated method stub
		int n=1;
		while(n<=10)
		{
			System.out.println(n);
			n++;
		}
		
	}


	private void reverseNumber() {
		// TODO Auto-generated method stub
		int n= 123456;
		int rem =0;
		while(n>0)
		{
			rem=rem*10+n%10;
			n=n/10;
		}
		System.out.println(rem);
		
		
	}

}
