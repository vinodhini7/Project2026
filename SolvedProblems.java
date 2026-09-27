package tamilnadu.chennai;

import java.util.Scanner;

public class SolvedProblems {

	public static void main(String[] args) {
		SolvedProblems s1 = new SolvedProblems();
		//s1.increasingNumber();
		//s1.evenNumber();
		//s1.threeeTable();
		//s1.square();
		s1.cubes();
		

	}

	private void cubes() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int number = 1;
		while (count >= 1) {
			number = number *3;
			
			System.out.println(number+ " ");
			
			
			count--;

		}
		
	}

	private void square() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int number = 1;
		while (count >= 1) {
			number = number *2;
			
			System.out.println(number+ " ");
			
			
			count--;

		}
	}
		
	

	private void threeTable() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int number = 1;
		while (count >= 1) {
			
			System.out.println(number *3+ " ");
			
			number++;
			count--;

		}
	}

	private void threeeTable() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int number = 1;
		while (count >= 1) {
			
			System.out.println(number *3+ " ");
			
			number++;
			count--;

		}
	}
	private void increasingNumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int number = 1;
		while (count >= 1) {
			System.out.println(number + " ");
			number = number + 1;
			count--;

		}

	}

	private void evenNumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int number = 2;
		while (count >= 1) {
			System.out.println(number + " ");
			number = number * 2;
			count--;

		}

	}

}
