package Assignment;
import java.util.Scanner;
public class if_else_Assignment_2 {

	public static void main(String[] args) {
		char alphabet ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet : ");
		alphabet = sc.next().charAt(0);
        if (alphabet== 'a' || alphabet=='e' || alphabet== 'i' || alphabet== 'o' || alphabet== 'u' || alphabet== 'A' || alphabet=='E' || alphabet== 'I' || alphabet== 'O' || alphabet== 'U')
        {
        	System.out.println(+alphabet+" is Vowel");
        }
        else 
        {
        	System.out.println(+alphabet+" is not Vowel");
        }
	}

}
