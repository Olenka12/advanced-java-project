
public class Order {
	private static Order orderInstance=null;
	String productName;
	double orderTotal;
	
	private Order()
	{
		//product name and order total will be obtained from order form in the future
		productName="Sample Product";
		orderTotal=1000;
	}
	
	public static Order getOrder()
	{
		if(orderInstance==null)
		{
			orderInstance=new Order();
		}
		
		return orderInstance;
	}
	
	public String toString()
	{
		String str="Order Details\nProduct Name: "+productName;
		str+="\n Order Total: "+orderTotal;
		
		return str;
	}
}
