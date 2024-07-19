package Assignment;
import java.util.Scanner;
public class SwitchCase_1 {

	
	
	public static void main(String[] args) {
		 int month,year,leaves,month_days=0,year_days=0;
		 float ca,ma,oa,pro_tax,salary_basic;
		 String emp_name,emp_id,month_n=null;
		
		System.out.println("Enter Employee ID");
		Scanner sc = new Scanner(System.in);
		emp_id=sc.next();
		System.out.println("Enter Employee name");
		emp_name=sc.next();
		System.out.println("Enter Month");
		month=sc.nextInt();
		System.out.println("Enter Year");
		year=sc.nextInt();
		System.out.println("Enter Leaves");
		leaves=sc.nextInt();
		System.out.println("Enter Conveyance Allowance");
		ca=sc.nextFloat();
		System.out.println("Enter Medical Allowance");
		ma=sc.nextFloat();
		System.out.println("Enter Other Allowances");
		oa=sc.nextFloat();
		System.out.println("Enter Salary Basic");
		salary_basic=sc.nextFloat();
		System.out.println("Enter Professional Tax");
		pro_tax=sc.nextFloat();
		
		if(month==1)
		{
			month_days=31;
			month_n="January";
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
			
		}
		else if(month==2)
		{
			month_n="February";
		if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
		{
			month_days=29;
			year_days=366;
			
		}
		else
		{
			month_days=28;
			year_days=365;
		}
		}
		else if(month==3)
		{   month_n="March";
			month_days=31;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		else if(month==4)
		{
			month_n="April";
			month_days=30;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		else if(month==5)
		{   month_n="May";
			month_days=31;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		else if(month==6)
		{   month_n="June";
			month_days=30;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		else if(month==7)
		{  month_n="July";
			month_days=31;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		else if(month==8)
		{   month_n="Agust";
			month_days=31;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		else if(month==9)
		{   month_n="September";
			month_days=30;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		else if(month==10)
		{   month_n="October";
			month_days=31;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		else if(month==11)
		{   month_n="November";
			month_days=30;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		else if(month==12)
		{   month_n="December";
			month_days=31;
			if(year % 400 == 0 || year %4 ==0 && year % 100 != 0)
			{
				
				year_days=366;
				
			}
			else
			{
				
				year_days=365;
			}
		}
		
		float caa=(salary_basic*12*5)/100;
		float maa=((salary_basic*12*ma)/100);
		float oaa=((salary_basic*12*oa)/100);
		float laa=((salary_basic/month_days)*leaves);
		float ctc = ((salary_basic*12)+caa+maa+oaa);
		float pt=(salary_basic-laa)-((salary_basic*12)*pro_tax)/100;
		float td = (pt+laa)-salary_basic;
		float te = caa+maa+oaa;
		float ne=(te+salary_basic)-td;
	System.out.println("Paid Days = "+(month_days-leaves)+" Days");
	System.out.println("Basic Salary = "+salary_basic+"/-");
	System.out.println("Total Working Days = "+month_days);
	System.out.println("Leaves Amount = "+laa);
	System.out.println("Conveyance Allowance = "+caa+"/-");
	System.out.println("Medical Allowance = "+maa+"/-");
	System.out.println("Other Allowances = "+oaa);
	System.out.println("CTC = "+ctc);
	System.out.println("Total Allowance = "+(caa+maa+oaa));
	System.out.println("Professional Tax = "+pt);
	System.out.println("Total Deductions = "+td);
	System.out.println("Total Earnings Allowance  Monthly = "+te);
	System.out.println("Net Salary   = "+ne);
	System.out.println("Month = "+month_n+"/"+year);
	
	}
	
	

}
