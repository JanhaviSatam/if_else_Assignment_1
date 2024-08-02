package janhavi;

public class array1 {

	public static void main(String[] args) {
		int a[]= {12,34,2,4523,22,90,455};
		int temp,size;
		
		size=a.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	temp=a[0];
	a[0]=a[size-1];
	a[size-1]=temp;
	
	for(int i=0;i<size;i++)
	{
		System.out.print(a[i]+" ");
	}

	}

}
