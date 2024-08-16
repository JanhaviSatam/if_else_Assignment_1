package janhavi;



class order{
	int orderId[], orderNumber[], amount[] , gst[];
	String location[];
	
	order(int orderId[], int orderNumber[], int amount[] , int gst[],String location[])
	{
		
	}
	void calaculateTotalAmount()
	{
		
	}
}

class creditlimit1 extends order
{
	int totalClient[];
	creditlimit1( int totalClient[],int orderId[], int orderNumber[], int amount[] , int gst[],String location[])
	{
		super(orderId, orderNumber, amount , gst);
	}
	
	void displayClentDetails()
	{
		
	}
}

class client1 extends creditlimit1{
	String clientName[], clientCity[];
	int clientCreditLimit[], totalCredit[];
		
	client1(String clientName[],String clientCity[],int clientCreditLimit[],int totalCredit[],int totalClient[], int orderId[], int orderNumber[], int amount[] , int gst[],String location[])
	{
		super(totalClient,orderId,orderNumber,amount, gst,location);
		this.clientName=clientName;
		
		this.clientCity=clientCity;
		this.clientCreditLimit=clientCreditLimit;
		this.clientCity=clientCity;
	}
	void updateCredit()
	{
		System.out.println(clientCity);
	}
	
	void checkCreditLimit()
	{
		
	}
}

public class advance_billing_system {

	public static void main(String[] args) {
		
   
    String clientName[]= {"Rajesh","Suresh","Mangesh","Ravi"  };
    String clientCity[]= {"Mumbai","Banglore","Delhi","Kolkata"};
    int clientCreditLimit[]= {2000,3000,4000,5000};
    int totalCredit[]= {200,300,400,500};
    int totalClient[]={10};
    int orderId[]= {1,2,3,4};
    int orderNumber[]= {11,22,33,44};
 
    int amount[]= {10,20,30,40};
    int gst[]= {18,20,18,20};
   
    String location[]= {"Goregaon","Satara","Malad","Kandivali"};
    client1 ob = new client1(clientName,clientCity,clientCreditLimit,totalCredit,totalClient,orderId, orderNumber, amount , gst,location);
    
     ob.updateCredit();
	}

}
