package Assignment;
import java.util.Scanner;
public class if_else_Assignment_4 {

	public static void main(String[] args) {
		
     int year ;
     System.out.println("Enter the year");
     Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
		if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
		{
			System.out.println(+year+" is Leap Year");
		}
		else
		{
			System.out.println(+year+" is not Leap Year");
		}
		
		
	}

}
