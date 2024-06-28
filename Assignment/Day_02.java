package Assignment;
import java.util.Scanner;
public class Day_02 {
    String name;
    int java,cp,jsp,ruby,ch, total,per;
	public static void main(String[] args) {
		Day_02 ob = new Day_02();
		ob.input();
		ob.output();

	}
	void input ()
	{   Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name ");
		name=sc.next();
		System.out.println("Enter JAVA marks ");
		java=sc.nextInt();
		System.out.println("Enter C++ marks ");
		cp=sc.nextInt();
		System.out.println("Enter JSP marks ");
		jsp=sc.nextInt();
		System.out.println("Enter Ruby marks ");
		ruby=sc.nextInt();
		System.out
		.println("Enter C# marks ");
		ch=sc.nextInt();
	}
	void output()
	{   
		if(java < 30 )
		{
			System.out.println("java = "+java+"/100"+"F");
		}
		else
		{
			System.out.println("java = "+java+"/100");
		}
		if(cp < 30)
		{
		System.out.println("C++ = "+cp+"/100"+"F");
		}
		else
		{
		System.out.println("C++ = "+cp+"/100");
		}
		if(jsp < 30) {
			System.out.println("JSP = "+jsp+"/100"+"F");
		}
		else
		{
		System.out.println("JSP = "+jsp+"/100");
		}
		if(ruby < 30)
		{
		System.out.println("Ruby = "+ruby+"/100"+"F");
		}
		else
		{
			System.out.println("Ruby = "+ruby+"/100");
		}
		if(cp < 30)
		{
		System.out.println("C# = "+ch+"/100"+"F");
		}
		else
		{
			System.out.println("C# = "+ch+"/100");

		}
		total = java+cp+jsp+ruby+ch;
		per=total/5;
		System.out.println();
		System.out.println("total"+" ="+total);
		System.out.println("Percentage"+" ="+per);
		
		if(java<30||cp<30||jsp<30||ruby<30||ch<30)
		{
			System.out.println("Result = Fail");
		}
		else
		{
			System.out.println("Result = Pass");
		}
		System.out.println("Percentage"+" ="+per);
	}
}
