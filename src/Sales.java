import java.io.IOException;
import java.util.Scanner;

public class Sales {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Currently implementing sales system as a console application 
		 * In the future I will convert this to a GUI application with a database 
		 */
		 UseLogger tester = new UseLogger();
	        try {
	            MyLogger.setup();
	        } catch (IOException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Problems with creating the log files");
	        }
	        tester.doSomeThingAndLog();
		
		System.out.println("Menu");
		System.out.println("1. Create an order\n2.View orders\n3.Exit\n");
		int choice = keyboard.nextInt();
		if (choice==1)
		{
			createOrder();
		}
		else if (choice ==2)
		{
			viewOrder();
		}
		else 
		{
			System.exit(0);
		}
		
	}
	public static void createOrder()
	{
		System.out.println("Customer Information");
		System.out.print("Customer Name: ");
		keyboard.nextLine();
		String name=keyboard.nextLine();
		System.out.print("Address: ");
		String address=keyboard.nextLine();
		System.out.print("Phone Number: ");
		String phone=keyboard.nextLine();
		
		System.out.println("Order Details");
		System.out.print("Product Name: ");
		String productName=keyboard.nextLine();
		
		System.out.print("Quantity Ordered: ");
		int qty=keyboard.nextInt();
		System.out.print("Price per Unit: ");
		double unitPrice=keyboard.nextDouble();
		
		System.out.println("Order Summary");
		double orderTotal=unitPrice*qty;
		System.out.println("Order Total: "+orderTotal);
		
		
	}
	public static void viewOrder()
	{
		System.out.println(Order.getOrder());
	}
}
