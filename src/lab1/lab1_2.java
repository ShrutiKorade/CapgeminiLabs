package lab1;
import java.util.Scanner;
public class lab1_2 {


	public static void main(String[] args) {

		System.out.println("TrafficLights");  

		System.out.println("press 1 for RED"); 
		System.out.println("press 2 for YELLOW"); 
		System.out.println("press 3 for GREEN"); 

		Scanner sc = new Scanner(System.in);  

		int choice = sc.nextInt();  

		lab1_2 a= new lab1_2();

		switch(choice) {
		case 1:
			a.Red();
			break;

		case 2:
			a.Yellow();
			break;

		case 3:
			a.Green();
			break;

		default:System.out.println("Wrong Choice");
		}
	}

	public void Red()
	{
		System.out.println("Stop");
	}

	public void Yellow()
	{
		System.out.println("Warning");
	}

	public void Green()
	{
		System.out.println("Go");
	}
}



