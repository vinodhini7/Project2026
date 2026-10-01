package tamilnadu.chennai;

public class SolvedProblemAmstrongNumber {

	public static void main(String[] args) {
		SolvedProblemAmstrongNumber S1 = new SolvedProblemAmstrongNumber();
		S1.checkNumber();
	}

	private void checkNumber() {
		// TODO Auto-generated method stub
		SolvedProblemAmstrongNumber S1 = new SolvedProblemAmstrongNumber();

		int number = 153;
		int digit = S1.countDigits(number);
		int number1 = number;
		int rem = 0;
		int temp;
		while (number > 0) {
			temp = number % 10;
			rem = (int) (rem + Math.pow(temp, digit));
			number = number / 10;
		}
		System.out.println(rem);
		if (rem == number1)
			System.out.println(number1 + " is a Palindrome");
		else
			System.out.println(number1 + " is not a Palindrome");

	}

	private int countDigits(int a) {
		// TODO Auto-generated method stub
		int count = 0;

		while (a > 0) {

			count++;
			a = a / 10;
			System.out.println("value of a" + a);
		}
		System.out.println("Count" + count);
		return count;

	}

}
