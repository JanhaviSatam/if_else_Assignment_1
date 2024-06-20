package Assignment;
import java.util.Scanner;
public class if_else_Assignment_5 {

	public static void main(String[] args) {
	int  num ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	num = sc.nextInt();
	if(num > 0)
	{
		System.out.println("Number is positive");
	}
	else if(num < 0)
	{
		System.out.println("Number is negative");
	}
	else
	{
		System.out.println("Number is zero");
	}
	}

}
