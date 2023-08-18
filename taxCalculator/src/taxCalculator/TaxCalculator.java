package taxCalculator;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the purchace amount");
		double purchaseamount=scan.nextDouble();
		double taxrate=scan.nextDouble();
		scan.close();
		System.out.println(calculateTax(purchaseamount,taxrate));

	}
	public static double calculateTax(double purchaseamount, double taxrate)
	{
	
		double result= purchaseamount*taxrate;
		return result+purchaseamount;
		
	}
     
}
