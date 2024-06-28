package Assignment;
import java.util.Scanner;
public class Day_04 {
    String password;
    String password1;
    int option,choice1;
	static int count = 0;
	void input()
	{
		System.out.println("Set your password");
		Scanner sc = new Scanner(System.in);
		password=sc.next();
		System.out.println("Enter your password again");
		password1=sc.next();
		if(password != password1)
		{
			System.out.println("Start MCQ Exam");
			System.out.println("Enter option 1 to start exam");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
		              
                     input();
				            
                      
				break;
				
				default :
                    System.out.println(" Wrong choosed ");

					
			}
		}
	}
	
	void input1()
	{
		         System.out.println(" 1. Who invented Java Programming ? "+
				   " 1. ) Guido van Rossum"+
				   " 2. ) James Gosling"+
				   " 3. ) Dennis Ritchie"+
				   " 4. ) Bjarne Stroustrup");
	}
	public static void main(String[] args) {
		Day_04 ob = new Day_04();
		ob.input();
       //System.out.println("Your marks is "+ob.count);
	}

}
