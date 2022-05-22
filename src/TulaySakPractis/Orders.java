package TulaySakPractis;

import java.util.Scanner;

public class Orders {
	
   public  double  total;
	public  Scanner input = new Scanner(System.in);
	
	public Orders()
	{
		
	}
	public  Orders(Customers customers) {
		
		
		Products products = new Products();
		
		int quantity = 0;
		if(products.ProductId == 1 ) {
			double tvPrice = 100;
			System.out.print("How many of this product would you like to buy?");
			quantity = input.nextInt();
			total = quantity* tvPrice;
			if (customers.ChooseCustomerType == 1)
			{
				total = total * 0.7;
			}
			else if (customers.ChooseCustomerType == 2)
			{
				total = total * 0.8;
			}
			else if (customers.ChooseCustomerType == 3)
			{
				total = total * 0.9;
			}
			
			long date1InMs = customers.RegisterDate.getTime();
			long date2InMs = System.currentTimeMillis();
			
			// getting the diff between two dates.
			long timeDiff = 0;
			if(date1InMs > date2InMs) {
				timeDiff = date1InMs - date2InMs;
			} else {
				timeDiff = date2InMs - date1InMs;
			}
			
			// converting diff into days
			int daysDiff = (int) (timeDiff / (1000 * 60 * 60* 24));
			
			if ( daysDiff > 365 * 2 )	
			{
				total -= tvPrice * 0.05 * quantity;
			}
			
			
			System.out.println("discounted amount payable:" + total);
			
		}else if(products.ProductId == 2 ) {
			double MoblePohonePrice = 50;
			System.out.print("How many of this product would you like to buy?");
			quantity = input.nextInt();
			total = quantity* MoblePohonePrice;
			System.out.print("Total Amount:"+ total);
		}
		

	}

	}


