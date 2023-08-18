package BitwiseSwapper;

import java.util.Scanner;

public class Swapper {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter first integer number");
		int num1=scan.nextInt();
		System.out.println("enter second integer");
		int num2=scan.nextInt();
		scan.close();
		swapUsingBitwise(num1,num2);
		
		

	}
	public static void swapUsingBitwise(int num1,int num2)
	{
		System.out.println("before swapping: num1 = " +num1+ ", num2 = " +num2);
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("after swapping: num1 = " +num1+ ", num2 = " +num2);
	}

}
