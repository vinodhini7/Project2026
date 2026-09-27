package tamilnadu.chennai;

import java.util.Scanner;

public class solvedProblem3 {
	
	public static void main(String[] args) {
		solvedProblem3 s3 = new solvedProblem3();
		//s3.reversalNumber();
		//s3.doubleDigitNumber();
		//s3.tripleDigitNumber();
		//s3.additionOfDigits();
		//s3.reversalwholeNumber();//palindrome
		s3.armstrong();
	}

	private void armstrong() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		int actual=number;
		int remainder=0;
		int count=0;
		int addition=0;
		while(number>0)
		{
			remainder=number%10;
			addition = addition+ remainder*remainder*remainder;
			
			count++;
			number=number/10;
		}
		System.out.println(addition);
		if(actual==addition)
		{
			System.out.println("It is armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	
		
	}

	private void reversalwholeNumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		int actual=number;
		int remainder=0;
		int count=0;
		int addition=0;
		while(number>0)
		{
			remainder=number%10;
			addition = addition*10+ remainder;
			
			count++;
			number=number/10;
		}
		System.out.println(addition);
		if(actual==addition)
		{
			System.out.println("It is palindrom");
		}
		else {
			System.out.println("Not palindrome");
		}
	
		
	}

	private void additionOfDigits() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		int total=0;
		while(number>0)
		{
			total=total+number%10;
		
		number=number/10;
		}
		System.out.println(total);
		
	}

	private void tripleDigitNumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		while(number>100)
		{
		System.out.println(number%1000);
		number=number/10;
		}
		
	}

	private void doubleDigitNumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		while(number>0)
		{
		System.out.println(number%100);
		number=number/100;
		}
		
		
	}

	private void reversalNumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		while(number>0)
		{
		System.out.println(number%10);
		number=number/10;
		}
		
		
	}
	
	
	
	

}
