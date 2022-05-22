package TulaySakPractis;

import java.util.Scanner;

public class Products {
		public  Scanner input = new Scanner(System.in);
		public int ProductId;
		public  Products() {
			System.out.println("=====================================");
			System.out.println("    Product           	 Unite Price ");
			System.out.println("-------------------------------------");
			System.out.println("  1.Samsung S20L TV      $100"		  );
			System.out.println("  2.LG S20 Mobile Phone  $50"		  );
			System.out.println("-------------------------------------");
			System.out.println("  3.Cancel  ");
			System.out.println("Press you want to buy product? \n");
			ProductId = input.nextInt();
		}
	}
