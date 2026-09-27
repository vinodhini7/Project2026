package tamilnadu.chennai;

public class SolvedProblem4 {
	public static void main(String[] args) {
		SolvedProblem4 sc = new SolvedProblem4();
		//sc.additionOfFirstFiveNumbers();
		sc.multiplicatioOfFirstFiveNumbers();
	}

	private void multiplicatioOfFirstFiveNumbers() {
		// TODO Auto-generated method stub
		int mulitplication=1;
		
		int number=1;
		while(number<=5)
		{
			mulitplication= mulitplication*number;
			number++;
		}
System.out.println(mulitplication);
}
		
		
	

	private void additionOfFirstFiveNumbers() {
		// TODO Auto-generated method stub
		int addition=0;
				int number=1;
				while(number<=5)
				{
					addition= addition+number;
					number++;
				}
		System.out.println(addition);
	}

}
