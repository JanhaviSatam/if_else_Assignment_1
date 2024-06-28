package Assignment;
import java.util.Scanner;
class input1
{   int n,m,o,p,q,r,a,b,c;
	void input1_1()
	{
		System.out.println("Enter Birth Year: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter Birth Month: ");
		m=sc.nextInt();
		System.out.println("Enter Birth Day: ");
		o=sc.nextInt();
		System.out.println("Enter Current Year: ");
		p=sc.nextInt();
		System.out.println("Enter Current Month ");
		q=sc.nextInt();
		System.out.println("Enter Current Day: ");
		r=sc.nextInt();
	}
	
	void output_1()
	{
		a=p-n;
		b=q-m;
	    c=r-o;
	    
	}
	
	void show_1()
	{
		System.out.println("Enter Birth Year: "+n);
		System.out.println("Enter Birth Month: "+m);
		System.out.println("Enter Birth Day: "+o);
		System.out.println("Enter Current Year: "+p);
		System.out.println("Enter Current Month "+q);
		System.out.println("Enter Current Day: "+r);
		System.out.println(a);

	}
	
	void show_2()
	{
		System.out.println("Age :");
		//System.out.println(+a+" "+"years "+b+" months "+c+" days");
		System.out.println(a);

	}
}

public class Day_03 {

	public static void main(String[] args) {
		input1 ob = new input1();
		ob.input1_1();
		ob.show_1();
		ob.show_2();
	}

}
