package lab1;
import java.util.*;
public class lab1_1 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);   
		int number= sc.nextInt();
		int sum=0;

		while(number!=0)
		{
			int digit= number%10;
			sum=sum+digit*digit*digit;
			number=number/10;
		}
		System.out.println("The sum of cubes of digits of the given number is " +sum);


	}
}


