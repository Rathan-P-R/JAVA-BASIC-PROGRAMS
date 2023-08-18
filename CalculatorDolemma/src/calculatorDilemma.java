import java.util.Scanner;

public class calculatorDilemma {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(addition(num1,num2));
		num1=scan.nextInt();
	    num2=scan.nextInt();
		System.out.println(subtract(num1,num2));
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(multiply(num1,num2));
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(division(num1,num2));
	}
	public static int addition(int num1, int num2)
	{
		return num1+num2;
	}
	public static int subtract(int num1, int num2)
	{
		return num1-num2;
	}
	public static int multiply(int num1, int num2)
	{
		return num1*num2;
	}
	public static double division(int num1, int num2)
	{
		return num1/num2;
	}

}
