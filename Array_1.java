package Assignment;
import java.util.Scanner;
public class Array_1
{
	public static void main(String args[])
	{
		
		int n,i,sum=0;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product List Size");
		
		n= sc.nextInt();
		String a[] = new String[n];
		for(i=1;i<n;i++)
		{
			System.out.println("Enter product "+i);
		     a[i]= sc.next();
		}
		int b[]= new int[n]	;	
		
		for(i=1;i<n;i++)
		{
		System.out.println("Enter "+a[i]+" Price");
		b[i]=sc.nextInt();
		}
		System.out.println("Enter GST");
		int gst=sc.nextInt();
		System.out.println("Do you want to add GST [Y/N]");
		ch = sc.next().charAt(0);
		
		if( ch == 'Y'||ch=='y')
		{
			for(i=1;i<n;i++)	
         	{
         	  System.out.println(+i+"."+a[i]+"="+b[i]+"/-");
         	  sum=sum+b[i]	;
         	}
			int sum_1= ((sum*gst)/100) ;
			int total_amt=sum+sum_1;
			System.out.println("------------------");
			System.out.println("Total :"+sum);
			System.out.println("GST :"+gst);
			System.out.println("------------------");
			System.out.println("Final Total :"+total_amt);
		}
		else if( ch == 'N'||ch=='n')
        {
         	for(i=1;i<n;i++)	
         	{
         	  System.out.println(+i+"."+a[i]+"="+b[i]+"/-");
         	  sum=sum+b[i]	;
         	}
         	
			System.out.println("------------------");
			System.out.println("Total :"+sum);
			
		}
	
		
		
	}
}
