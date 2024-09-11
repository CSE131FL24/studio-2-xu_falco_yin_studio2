package studio2;

import java.util.Scanner;

public class Gamblers_Ruin {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter how much you want to play:");
	double money = in.nextDouble();
	double x = money;
	System.out.println("Please set the win limit:");
	double z = in.nextDouble();
	
	System.out.println("How many simulations would you like to run?");
	int d = in.nextInt();
	int n = 1;
	for (n = 1; n<=d; n++) {
	
	            while (x > 0) {
	   	      		boolean winMoney = Math.random() <= Math.random(); 
	  	    	      if (winMoney && x<z) {x = x + 1;}
	    	    	    	      
					if (!winMoney && x > 0) {x = x-1;}
	    	         	      
	    	     	    	      
	    	      if (x==z) {System.out.println("Simulation " + n + ": WON");
	    	      if (x==0) {System.out.println("Simulation " + n + ": LOST");
	    	      
	    	 
	    	      
	    	      
	    	      
	     }
	}
	}
}
}
}