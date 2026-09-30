package tamilnadu.chennai;

public class solvedProblemPalindrome {
	public static void main(String[] args) {
		solvedProblemPalindrome S1 = new solvedProblemPalindrome();
		S1.checkNumberIsPalindrome();
	}

	private void checkNumberIsPalindrome() {
		// TODO Auto-generated method stub
		int number =13331;
		int number2=number;
		int rem=0;
		while(number>0)
		{
			rem=(number%10)+rem*10;
			System.out.println(rem);
			number=number/10;
			System.out.println(number);
		}
		System.out.println(rem);
		if(rem==number2)
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
		
	}

}
