package lab1;
import java.util.Scanner;
public class lab1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int m=scn.nextInt();
		if(checkNumber(m))
		{
			System.out.println(m+"is an increasing number");
		}
		else {
			System.out.println(m+"not a increasing number");
		}
	}
	static boolean checkNumber(int num)
	{
		int n=num;
		while(n>0)
		{
			int rem1=n%10;
			n=n/10;
			int rem2=n%10;
			if(rem1<rem2)return false;
		}
		return true;
	}

}


