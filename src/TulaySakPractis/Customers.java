package TulaySakPractis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Customers {
	
		
		public  Scanner input = new Scanner(System.in);
		public  int ChooseCustomerType;
		public  Date RegisterDate;
		public  Customers() {
			
			System.out.println("Enter yor memeber date : dd-MM-yyyy ");

			String date = input.next();

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			try {
			    //Parsing the String
				RegisterDate = dateFormat.parse(date);
			} catch (ParseException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			
			System.out.println("=====================");
			System.out.println("   1.Gold           ");
			System.out.println("   2.Silver        	");
			System.out.println("   3.Affiliate    	");
			System.out.println("=====================");
		
			System.out.println("Please enter your membership card:\n ");
			ChooseCustomerType = input.nextInt();
		
		}
}

