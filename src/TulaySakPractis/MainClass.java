package TulaySakPractis;

import java.util.Scanner;

public class MainClass {
	
	public static double TakeOrder(Customers customers)
	{
		Orders order = new Orders(customers);
		return order.total;
				
	}
		public static void main(String[] args) 
		{

			double totalAmount = 0;
			Customers customers = new Customers();
			
			String newProduct = "Y";
			 Scanner input = new Scanner(System.in);
			while (newProduct.equals("Y"))
			{
				totalAmount += TakeOrder(customers);
				System.out.println("Would you like to buy another product? ( You choose Y or N)");
				newProduct = input.next();
			}
			
			
			int discount = ((int) totalAmount / 200) * 5;
			totalAmount -= discount;
			System.out.print("Total Amount:"+ totalAmount );
		}
		
//		public static double TakeOrder(Customers customers)
//		{
//			Orders order = new Orders(customers);
//			return order.total;
//					
//		}
	}





