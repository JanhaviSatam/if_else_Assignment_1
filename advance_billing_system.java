package janhavi;

class order{
	int orderId[], orderNumber[], amount[] , gst[];
	String location[];
	
	order(int orderId[], int orderNumber[], int amount[] , int gst[],String location[])
	{
		this.orderId=orderId;
		this.orderNumber=orderNumber;
		this.amount=amount;
		this.gst=gst;
		this.location=location;
		
	}
	void calaculateTotalAmount()
	{
		
	}
	
}



class client1 extends order{
	String clientName[], clientCity[];
	int clientCreditLimit[], totalCredit[];
		
	client1(String clientName[],String clientCity[],int clientCreditLimit[],int totalCredit[], int orderId[], int orderNumber[], int amount[] , int gst[],String location[])
	{
		super(orderId,orderNumber,amount, gst,location);
		this.clientName=clientName;
		
		this.clientCity=clientCity;
		this.clientCreditLimit=clientCreditLimit;
		this.clientCity=clientCity;
	}
	void updateCredit()
	{
		
	}
	
	void checkCreditLimit()
	{
		
	}
	
	
	
}
class creditlimit1 extends client1 
{
	int totalClient[];
	creditlimit1( String clientName[],String clientCity[],int clientCreditLimit[],int totalCredit[],int totalClient[], int orderId[], int orderNumber[], int amount[] , int gst[],String location[])
	{
		super(clientName,clientCity,clientCreditLimit,totalCredit,orderId, orderNumber, amount , gst,location);
	    this.totalClient=totalClient;
	    
	}
	
	
	void displayClentDetails()
	{
		int i;
		for(i=0;i<clientName.length;i++)
		{
		System.out.println("Client: "+clientName[i]);
		System.out.println("City: "+clientCity[i]);
		System.out.println("__________________________");
	}
//		order a =new order( orderId, orderNumber ,amount  ,gst, location);
//		for( i=0;i<clientName.length;i++)
//		{
//			System.out.println("Order ID: "+a.orderId);
//			System.out.println("Order Number: "+a.orderNumber);
//		    System.out.println("Location: "+a.location);
//		    System.out.println("GSt: "+a.gst);
//		    System.out.println("______________________________");
//		    
//		}
//		for( i=0;i<clientName.length;i++)
//			{
//				System.out.println("Order ID: "+orderId);
//				System.out.println("Order Number: "+orderNumber);
//			    System.out.println("Location: "+location);
//			    System.out.println("GSt: "+gst);
//			    System.out.println("______________________________");
//			    
//			}	
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
    creditlimit1 ob = new creditlimit1(clientName,clientCity,clientCreditLimit,totalCredit,totalClient,orderId, orderNumber, amount , gst,location);
    
     ob.displayClentDetails();
     ob.display();
	}

}
