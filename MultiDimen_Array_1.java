package Assignment;

import java.util.Scanner;

public class MultiDimen_Array_1 {

	public static void main(String[] args) {
		System.out.println("Enter size of row");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("Enter size of columns");
		int c = sc.nextInt();
		int  a[][] = new int[r][c];
		
		for(int i= 0; i<r;i++)
		{
			for(int j= 0; j<c;j++)
			{
				System.out.println("Enter the values in multi dimentional array");
				a[i][j]= sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i= 0; i<r;i++)
		{
			for(int j= 0; j<c;j++)
			{
				System.out.print(+a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		

}
}