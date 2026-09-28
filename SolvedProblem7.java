package tamilnadu.chennai;

public class SolvedProblem7 {
	
	public static void main(String[] args) {
		SolvedProblem7 S1 = new SolvedProblem7();
		S1.reverseNumber();
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
