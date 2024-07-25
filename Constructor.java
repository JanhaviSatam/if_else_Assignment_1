package Assignment;
import java.util.Scanner;
public class Constructor {
int a;
Constructor(float ProductPrice , String ProductName)
{
	System.out.println("Product Name:"+ProductName);
	
	System.out.println("Product Price:"+ProductPrice);
	
}
int tax1(float productprice1, String name)
{
	System.out.println((productprice1*18)/100);
	
	return 100;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price");
		int n = sc.nextInt();
		System.out.println("Enter Product name");
		String name = sc.next();
		Constructor ob = new Constructor(n,name);
		System.out.println(ob.tax1(n, name));

	}

}
