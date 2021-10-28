package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class lab2_3 {

	public static void main(String[] args) {

		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the Numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("original array :"+ Arrays.toString(arr));
		int[]result =lab2_3.revCalculator(arr);
		Arrays.sort(result);
		System.out.println("reversed array :"+ Arrays.toString(result));
		sc.close();
	}

	public static  int[] revCalculator(int [] arr) {
		int [] reverse = new int [arr.length];
		for(int j =0;j<arr.length;j++) {
			do {
				reverse[j]=reverse[j] * 10 + arr[j] %10;
				arr[j] /= 10;		
			}while(arr[j]>0);
		}
		return reverse;
	}
}

