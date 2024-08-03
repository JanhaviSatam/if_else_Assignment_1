package janhavi;


class A{
	
	 int a;
	int b;
	A(int a , int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("A class is "+a);
		System.out.println("B class is "+b);
	}
	
}

class B extends A{
	int c ;
	B(int a,int b,int c){
		super(a,b);
		this.c=c;
		
		
	}
}

public class Inheritence_3 {

	public static void main(String[] args) {
		
    	B ob = new B(45,56,35);
	 System.out.println(ob.a);
	 System.out.println(ob.b);
	 System.out.println(ob.c);
	 ob.display();
		
     
	}

}
