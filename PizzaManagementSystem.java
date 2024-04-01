package pizzaManagement;

import java.util.Scanner;
public class PizzaManagementSystem 
{
	static void menu() 
	{
		System.err.println("List of Veg pizza's");
		System.out.println("*Choose your choice from 1 to 5*");
	    System.out.println("1.Paneer Special Pizza.");
	    System.out.println("2.Margherita Pizza.");
	    System.out.println("3.Spicy Triple Tango.");
	    System.out.println("4.Crisp Capsicum & Fresh Tomato Pizza.");
	    System.out.println("5.Tandoori Paneer Pizza");
	}
	static void menu1() 
	{
		System.err.println("List of Non-veg pizza's");
		System.out.println("Choose your choice from 6 to 10");
		System.out.println("6.Classic Chicken Pizza.");
		System.out.println("7.Pepperoni Pizza.");
		System.out.println("8.Chicken Golden Delight.");
		System.out.println("9.Chicken sausage.");
		System.out.println("10.Moroccan Spice Pasta Pizza - Non Veg.");
	}
	 static void feedback(int r) 
	 {
		if(r<=4) {
			System.out.println("Thanks for sharing your feedback.");
			System.out.println("Visit us again.");
		}
		else if (r==5) {
		System.out.println("Thankyou for sharing your valuable feedback");
		System.out.println("Visit us again.");
	}
		else {
			System.err.println("Invalid input");
		}
		}
    public static void main(String[] args)
    {
    	try {
    		PizzaManagementSystem pizza = new PizzaManagementSystem();
            Scanner s = new Scanner(System.in);
            String customerName;
            System.out.print("Enter Your Name: ");
            customerName = s.nextLine();
            
            System.out.println("\nWelcome, " + customerName + "!");
            System.out.println("which type of pizza you prefer for ?");
            System.out.println("1.veg");
            System.out.println("2.Non veg");
            System.out.println("Enter your choice as 1 and 2 ");
            int input = s.nextInt();
            if (input==1){
            	PizzaManagementSystem.menu();
        }
            else if (input==2) {
            	 PizzaManagementSystem.menu1();
             }
            else {
            	 System.err.println("Invalid input");
            }
            int choice1 = s.nextInt();
            double totalPrice =0;
            
            switch (choice1) {
            case 1:
                System.out.println("You have selected Paneer Special Pizza of Rs/- 199.");
                totalPrice = 199.0;
                break;
            case 2:
                System.out.println("You have selected Margherita Pizza of Rs/- 299.");
                totalPrice = 299.0;
                break;
            case 3:
                System.out.println("You have selected Spicy Triple Tango of Rs/- 399.");
                totalPrice = 399.0;
                break;
            case 4:
                System.out.println("You have selected Crisp Capsicum & Fresh Tomato Pizza of Rs/- 499.");
                totalPrice = 499.0;
                break;
            case 5:
                System.out.println("You have selected Tandoori Paneer Pizza of Rs/- 99.");
                totalPrice = 99.0;
                break;
            case 6:
                System.out.println("You have selected Classic Chicken Pizza of Rs/- 599.");
                totalPrice = 599.0;
                break;
            case 7:
                System.out.println("You have selected Pepperoni Pizza of Rs/- 409.");
                totalPrice = 409.0;
                break;
            case 8:
                System.out.println("You have selected Chicken Golden Delight of Rs/- 890.");
                totalPrice = 890.0;
                break;
            case 9:
                System.out.println("You have selected Chicken sausage of Rs/- 909.");
                totalPrice = 909.0;
                break;
            case 10:
                System.out.println("You have selected Moroccan Spice Pasta Pizza - Non Veg of Rs/- 799.");
                totalPrice = 799.0;
                break;
            default:
                System.err.println("Invalid choice. Please try again.");
                break;}
            
                System.out.println("Would you like to add any additional toppings? (Y/N)");
            String addToppings = s.next();
            switch (addToppings.toUpperCase())
            {
            case "N":
                System.out.println("No additional toppings will be added.");
                System.out.println("Your order has been placed ");
                System.out.println("The order id is :- " +pizza.hashCode());
                System.out.println("Your order total is: Rs" + totalPrice);
                System.out.println("your rating is valuable for us .Rate us from 1 to 5 ");
                int Rating1 = s.nextInt();
                PizzaManagementSystem.feedback(Rating1);
                break;
            default:
            	System.out.println("Invalid choice.");
        break;}
                switch (addToppings.toUpperCase()) {
                case "Y":
                	System.out.println("1.Extra cheese");
                	System.out.println("2.Onions");
                	System.out.println("3.Mushrooms");
                	System.out.println("4.Tomatoes");
                	System.out.println("5.Sausage");
                	System.out.println("6.Not available in the list"); }
                	int choice2 = s.nextInt();
                	switch( choice2 ) {
                	
                	case 1:
                	case 2:
                	case 3:
                	case 4:
                	case 5 :
                    System.out.println(" Topping was added in to your order. Please enter the number of toppings that u want to add");
                    int numtoppings = s.nextInt();
                    totalPrice += numtoppings * 100;
                    System.out.println("your order has been placed and Id is:" +pizza.hashCode());
                    System.out.println("Your order amount is: Rs" + totalPrice);
                    System.out.println("your rating is valuable for us .Rate us from 1 to 5 ");
                    int Rating2 = s.nextInt();
                    PizzaManagementSystem.feedback(Rating2);
                    break;
                	case 6:
                    	System.out.println("Sorry for the inconvience. Right now we are having only these topings");
                    	System.out.println("Do you want to proceed with your order without toppings");
                    	System.out.println("Reply with yes/no");
                    	String input1 = s.next();
                    	switch (input1.toLowerCase()) {
                    	case "yes" :
                    		System.out.println("The cost of each topping is 100 ");
                    		System.out.println("your order has been placed and Id is:" +pizza.hashCode());
                            System.out.println("Your order amount is: Rs" + totalPrice);
                            System.out.println("your rating is valuable for us .Rate us from 1 to 5 ");
                            int Rating = s.nextInt();
                            PizzaManagementSystem.feedback(Rating);
                            break;
                    	case "no" :
                        	 System.out.println(" ok thanks for visiting. visit us again");
                        	 break;
                        	 default :
                        		 System.err.println("Invalid input");
                        		 break;
                    	}
                	
            s.close();
        }
    }catch ( Exception e) {
    	System.err.println("please choose correct input from the choice");
    }
    	}
}
