package temparatureConversion;

import java.util.Scanner;

public class temp_conversion {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter your choice between 1 or 2");
		
		 int n=scan.nextInt();
		 if(n==1) {
			 System.out.println("welcme to celcius to fahrenheit conversion tool");
			 double celcius=scan.nextDouble();
			 System.out.println(celciusToFarhenheit(celcius));
		 }
		 else if(n==2)
		 {
			 System.out.println("welcome to fahrenheit to celcius conversion tool ");
			 double fahrenheit=scan.nextDouble();
			 System.out.println(fahrenheitToCelcius(fahrenheit));
			
			 
		 }
		 else
		 {
			 System.out.println("wrong selection");
		 }
		 
		 scan.close();
		
		

	}
	public static double celciusToFarhenheit(double celcius)
	{
		return(celcius*9/5)+32;
		
	}
	public static double fahrenheitToCelcius(double fahrenheit)
	{
		return(fahrenheit-32)*5/9;
	}

}
