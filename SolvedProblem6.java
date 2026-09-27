package tamilnadu.chennai;

public class SolvedProblem6 {
	public static void main(String[] args) {
		SolvedProblem6 S1 = new SolvedProblem6();
		//S1.fibinocciThreeNumbers();
		//S1.fibinocciTwoNumbers();
		S1.odd();
	}

	private void odd() {
		// TODO Auto-generated method stub
		int n=5;
		if(n%2!=0)
		{
			System.out.println("n is odd");
		}
		else
			System.out.println("n is even");
		
	}

	private void fibinocciTwoNumbers() {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		while(f<13)
		{
		s=f+s;
		f=s-f;
		System.out.println(f);
		}
		
	}

	private void fibinocciThreeNumbers() {
		// TODO Auto-generated method stub 
		int f=-1;
		int s=1;
		int t=0;
		while(t<13)
		{
			
			t=s+f;
			f=s;
			s=t;
			System.out.println(t);
		}
				
		
	}

}
