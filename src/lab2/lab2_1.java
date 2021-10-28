package lab2;
import java.util.Arrays;
import java.util.*;
public class lab2_1 {

	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of integer");
		int n = sc.nextInt();
		int arr [] = new int[n];
		System.out.println("Enter the integer value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);
		sc.close();
	}

}