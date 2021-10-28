package lab3;
import java.util.*;
public class lab3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER the String value");
		String s1 = sc.nextLine();
		String reverse = new StringBuffer(s1).reverse().toString();

		System.out.println(s1 + "|" + reverse);
		sc.close();
	}
}

