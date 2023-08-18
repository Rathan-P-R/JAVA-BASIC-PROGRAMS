package LogicalOperatorValidator;

import java.util.Scanner;

public class logicalValidator {

	public static void main(String[] args) {
		boolean isInputValid=true;
		boolean meetsCondition=true;
		boolean isvalid=isValidInput(isInputValid ,  meetsCondition);
		System.out.println("is input valid (true/false): " +isInputValid);
		System.out.println("does input meet a certai condition (true/false): " +meetsCondition);
		
		

	}
	public static boolean isValidInput(boolean isInputValid , boolean  meetsCondition)
	{
	return isInputValid && meetsCondition;
	}

}
