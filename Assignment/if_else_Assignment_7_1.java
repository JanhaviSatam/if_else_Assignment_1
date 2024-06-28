package Assignment;
import java.util.Scanner;
public class if_else_Assignment_7_1 {

	public static void main(String[] args) {
		String pass1 ,pass2;
	    int count;
		System.out.println("Set Your Password");
		
       
         Scanner sc = new Scanner(System.in);
         pass1 = sc.next();
         System.out.println("Enter Your Password");
         pass2 = sc.next();
        
         for( count = 3; count >= 0; count--) {
        	    if(!pass1.equals(pass2)) {  
        	        System.out.println("Enter the password " + count + " more time(s)");
        	    } else {
        	        System.out.println("Passwords match!");
        	        break;
        	    }
        	}
         
         
         
         
         if(pass1.equals(pass2))
         {   int option;
         
        	System.out.println(" Start the game " );
        	System.out.println("  1. Who invented Java Programming?\r\n"
        			+ "   1. ) Guido van Rossum\r\n"
        			+ "   2. ) James Gosling\r\n"
        			+ "   3. ) Dennis Ritchie\r\n"
        			+ "   4. ) Bjarne Stroustrup" );
        	Scanner scc = new Scanner(System.in);
        	option = scc.nextInt();
        	switch(option)
        	{
        	
        	case 1: 
        		System.out.println("Play next time");
        		break;
        	case 2:
        		System.out.println("correct Answer");
        		System.out.println("2. Which component is used to compile, debug and execute the java programs?\r\n"
        				+ "   1. ) JRE\r\n"
        				+ "   2. ) JIT\r\n"
        				+ "   3. ) JDK\r\n"
        				+ "   4. ) JVM");
        		int optionn = scc.nextInt();
        		switch(optionn)
        		{
        		case 1:
        			System.out.println("Play next time");
        			break;
        		case 2:
        			System.out.println("Play next time");
        			break;
        		case 3:
        			System.out.println("correct Answer");
        			break;
        		case 4:
        			System.out.println("Play next time");
        			break;	
        		default:
            		System.out.println("Invalid input");
            		break;
        		}
        		break;
        	case 3:
        		System.out.println("Play next time");
        		break;
        	case 4 :
        		System.out.println("Play next time");
        		break;
        		default:
        			System.out.println("Invalid input");
            		break;
        		
        	}
         }
      
	}

}
