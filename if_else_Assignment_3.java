package Assignment;
import java.util.Scanner;
public class if_else_Assignment_3 {

	public static void main(String[] args) {
		int num1 , num2 , num3;
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		System.out.println("Enter second number");
		num3 = sc.nextInt();	
		
		if(num1>num2 && num1 > num3)
		{
			System.out.println("Largest Number :"+num1);
		}
		else if(num2>num1 && num2 > num3)
		{
			System.out.println("Largest Number :"+num2);
		}
		else
		{
			System.out.println("Largest Number : "+num3);
		}
	}

}
