package Assignment;

import java.util.Scanner;


public class Day_01
 {
	int  salary , leave , tds , month, year , ysalary,one_day_amount , final_pay_salary ,leaveamount;
	String name ,emp_id;
	//Float leaveamount;
	 public static void main(String [] args)
	 {   
		 Day_01 ob = new Day_01(); 
		ob.input();
		ob.output();
		
	 }
	 
	 void input()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee Name");
		  name = sc.next();
		 System.out.println("Enter Employee ID");
		  emp_id = sc.next();
		  System.out.println("Enter Employee Salary(Monthly)");
		  salary = sc.nextInt();
		  System.out.println("Enter Leave (Days)");
		  leave = sc.nextInt();
		  System.out.println("TDS %");
		  tds = sc.nextInt();
		  System.out.println("Month");
		  month = sc.nextInt();
		  System.out.println("year");
		  year = sc.nextInt();
	 }
	 void output() {
		System.out.println("Name : "+name) ;
		System.out.println("EMP ID : "+emp_id) ;
		System.out.println("Monthly Salary : "+salary) ;
		ysalary = 12 * salary;
		System.out.println("CTC (Yearly Salary): "+ysalary) ;
        one_day_amount = salary / 30 ;
		 leaveamount = leave * one_day_amount;
		 System.out.println("Leave Amount: "+leaveamount) ;
		 final_pay_salary = salary - leaveamount ;
		 System.out.println("Final Pay Salary: "+final_pay_salary) ;
	 }
 }
