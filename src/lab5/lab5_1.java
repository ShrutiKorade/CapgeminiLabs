package lab5;

import java.util.Scanner;
class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3240015685634668637L;

	InvalidInputException(String exceptionText)
	{
		super(exceptionText);
	}

}
public class lab5_1 {




	public static void main(String[] args) {

		System.out.println("Enter the age of person :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		try {
			if(age<15)
			{
				throw new InvalidInputException("Exception");
			}
			else {

				System.out.println("Entered age is valid");

			}
		}
		catch(InvalidInputException e)
		{
			System.out.println("Caught exception - Please enter age greater than 15");
		}
	}

}

