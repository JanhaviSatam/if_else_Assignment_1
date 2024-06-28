package Assignment;
import java.util.Scanner;
public class if_else_Assignment_6 {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		ch = sc.next().charAt(0);
		if(ch >= 'a' && ch<='z' || ch>='A' && ch <= 'Z')
		{
			System.out.println("The character is Alphabet");	
		}
		else
		{
			System.out.println("The enter input is not character");
		}
	}

}
