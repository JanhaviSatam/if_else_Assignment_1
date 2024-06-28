package Assignment;
import java.util.Scanner;
public class if_else_Assignment_1 {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
         a= sc.nextInt();
         
         if(a%2==0)
         {
        	 System.out.println("Your Number is : Even");
         }
         else
         {
        	 System.out.println("Your Number is : Odd");
         }
	}

}
