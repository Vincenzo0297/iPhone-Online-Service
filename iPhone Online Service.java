// Full Name: Ong Guo Xiang
// Full Time 
// Tutorial Group: T07F
// Declaration: I declare this is my work
// File name: Vincent_A1.java 

import java.util.Scanner;
class Vincent_A1.java
{
    
	public static void main(String[] args) {
	    
	    // Declare variables
		String s1, s2, s3, address, country;
	    int a, b, c, code;
        int q1, q2, q3, iphone1, iphone2, iphone3;
        int t, t2, t3;
		double price1, price2, price3, totalcost, totalcost2, totalcost3, subtotal;
        double gst, gst2, gst3, totalgst, everything;
        
        // Construct a Scanner object that can enter info using the keyboard
        Scanner input = new Scanner(System.in);
        
        //read the iphone online service
		System.out.println("Welcome to iPhone online service ");
		System.out.println("----------------------");
		System.out.println("Enter three iPhone to be sold ");
		s1 = input.nextLine();
		s2 = input.nextLine();
		s3 = input.nextLine();

        System.out.println("\n---------------------------------------------\n");

	 // Display iphone online service information
		System.out.println("Welcome to iPhone online service ");
		System.out.println("----------------------");
		System.out.println("Enter three iPhone to be sold ");
		
		System.out.printf ("1. %s%n", s1);
		System.out.printf ("2. %s%n", s2);
    	System.out.printf ("3. %s%n", s3);
    	System.out.println("\n---------------------------------------------\n");
    	
    	//read delievery information
    	System.out.println("Some other info");
    	System.out.println("-----------------");
    	System.out.println("Delivery Address: ");
    	address = input.nextLine();
    	System.out.println("Postal Code: ");
    	code = input.nextInt ();
    	System.out.println("Country: ");
    	country = input.next ();
    	
    	//display delievery information
    	System.out.println();
    	System.out.printf ("Delivery Address. %s%n", address);
    	System.out.printf ("Postal Code: %d%n", code);
    	System.out.printf ("Country: %s%n", country);
    	System.out.println("\n---------------------------------------------\n");
    	
    	// Read in the iphone quantities and price
		System.out.print ("Enter the quantities and price of iPhone 12 Mini: ");
		q1 = input.nextInt ();
		price1 = input.nextDouble ();
		// To get rid of input buffer (usually read and discard)
		input.nextLine ();
		
		// Read in the iphone quantities and price
		System.out.print ("Enter the quantities and price of iPhone 12 Pro: ");
		q2 = input.nextInt ();
		price2 = input.nextDouble ();
		// To get rid of input buffer (usually read and discard)
		input.nextLine ();

		// Read in the iphone quantities and price
		System.out.print ("Enter the quantities and price of iPhone 12 Max: ");
		q3 = input.nextInt ();
		price3 = input.nextDouble ();
		// To get rid of input buffer (usually read and discard)
		input.nextLine ();
		
		// Display the table information 
		System.out.println ();
		System.out.print("\nSummary of iPhones");
		System.out.println("\n----------------------\n");
		System.out.printf ("%-5s" + "%-10s   " + "%-10s%n",
									"iPhone        ", "Quality     ", "Price");
	    System.out.println ("----------" + "----------" +"----------" +"----------" +"----------" + "-----");
		 
		System.out.printf ("%-5s" + "%5d  " + "%-10.2f%n",
									"iPhone 12 Mini: ", q1, price1);
		
		System.out.printf ("%-5s" + "%5d  " + "%-10.2f%n",
									"iPhone 12 Pro: ", q2, price2);
		
		System.out.printf ("%-5s" + "%5d  " + "%-10.2f%n",
									"iPhone 12 Max: ", q3, price3);	
									
	    System.out.println ("----------" + "----------" +"----------" +"----------" +"----------" + "-----");
	    
	    //swap the name info of the 1st and 2nd iPhones.
	    int temp = q1;
		q1 = q2;
		q2 = temp;
		//swap the price of the 1st and 2nd iPhones.
		double temp2 = price1;
		price1 = price2;
		price2 = temp2;
		
		// Display the table information
		System.out.println ();
		System.out.print("\nSummary of iPhones after swaps");
		System.out.println("\n-------------------------------\n");
		System.out.printf ("%-5s" + "%-10s   " + "%-10s%n",
									"iPhone        ", "Quality     ", "Price");
	    System.out.println ("----------" + "----------" +"----------" +"----------" +"----------" + "-----");
		 
		System.out.printf ("%-5s" + "%5d  " + "%-10.2f%n",
									"iPhone 12 Pro: ", q1, price1);
									
		System.out.printf ("%-5s" + "%5d   " + "%-10.2f%n",
									"iPhone 12 Mini: ", q2, price2);
									
		System.out.printf ("%-5s" + "%5d   " + "%-10.2f%n",
									"iPhone 12 Max: ", q3, price3);
									
	    System.out.println ("----------" + "----------" +"----------" +"----------" +"----------" + "-----");

        // To get rid of input buffer (usually read and discard)
		input.nextLine ();
	  
		//read customer that their place order 
		System.out.println("please  place your order");
		System.out.println("------------------------ ");
		System.out.println("No of iPhone 12 Pro: ");
		a = input.nextInt ();
		// To get rid of input buffer
		input.nextLine();
		// Compute the price of the quantities and price for iphone 12 pro order
	    totalcost = a * price1;
	    
	    System.out.print ("No of iPhone 12 Mini: ");
		b = input.nextInt ();
		// To get rid of input buffer
		input.nextLine();
	    // Compute the price of the quantities and price for iphone 12 mini orders
		totalcost2 = b * price2;
	    
	    System.out.print ("No of iPhone 12 Max: ");
		c = input.nextInt ();
		// To get rid of input buffer
		input.nextLine();
		// Compute the price of the quantities and price for iphone 12 max orders
	    totalcost3 = c * price3;
		
		//display the table information
		System.out.println ();
		System.out.print("\nSummary of your order");
		System.out.println("\n----------------------\n");
		System.out.printf ("%-5s" + "%-10s   " + "%-10s%n",
									"iPhone        ", "Quality     ", "Cost");
	    System.out.println ("----------" + "----------" +"----------" +"----------" +"----------" + "-----");
		 
		System.out.printf ("%-5s" + "%5d  " + "%-10.2f%n",
									"iPhone 12 Mini: ", a , totalcost );
		System.out.printf ("%-5s" + "%5d  " + "%-10.2f%n",
									"iPhone 12 Pro: ", b , totalcost2 );
		System.out.printf ("%-5s" + "%5d  " + "%-10.2f%n",
									"iPhone 12 Max: ", c , totalcost3 );							
									
	    System.out.println ("----------" + "----------" +"----------" +"----------" +"----------" + "-----");
	    
	    //update the subtotal, gst and everything after adding gst 
	    subtotal = totalcost + totalcost2 + totalcost3;
	  	System.out.printf ("%-5s" + "%-5s  " + "%-10.2f%n",
									"Subtotal: ","\t\t ", subtotal);
	    gst = (0.07 * (a*price1));
	    gst2 = (0.07 * (b*price2));
	    gst3 = (0.07 * (c*price3));
	    totalgst = gst + gst2 + gst3;
	    //display table information
	    System.out.printf ("%-5s" + "%-5s  " + "%-10.2f%n",
									"Gst (7%): ","\t\t ", totalgst);
		everything = totalgst + subtotal;
		System.out.printf ("%-5s" + "%-5s  " + "%-10.2f%n",
		                                                    "Total Cost: ","\t\t ", everything);
		 System.out.println ("----------" + "----------" +"----------" +"----------" +"----------" + "-----");    
		 // To get rid of input buffer
		 input.nextLine();

		//display the table information							
		System.out.println("Balance report");
		System.out.println("----------------------");
		
		// compute amount of stock and Balance left after the update
		t = q1 - a;
		t2 = q2 - b;
		t3 = q3 - c;
		System.out.printf ("%-5s" + "%-10s   " +"%-10s   "+"%-10s%n",
									"iPhone        ", "Quality", "Sold", "Balance");
	    System.out.println ("----------" + "----------" +"----------" +"----------" +"----------" + "-----");
	    System.out.printf ("%-5s" + "%5d  " +  "%5d  "+ "%5d%n",
									"iPhone 12 Pro: ", q1, a, t);
	    
	     System.out.printf ("%-5s" + "%5d  " +  "%5d  "+ "%5d%n",
									"iPhone 12 Pro: ", q2, b, t2);
	    
	     System.out.printf ("%-5s" + "%5d  " +  "%5d  "+ "%5d%n",
									"iPhone 12 Pro: ", q3, c, t3);
	    
	     System.out.println ("----------" + "----------" +"----------" +"----------" +"----------" + "-----");
	}
}