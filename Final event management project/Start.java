import java.lang.*;
import classes.*;
import interfaces.*;
import java.util.*;
import java.io.*;

public class Start {
	public static void main(String args[])
	{
		System.out.println();
        System.out.println("\tWelcome to Event management");
		boolean choice = true;
		Scanner input = new Scanner(System.in);
		WPlanner wp = new WPlanner();
		
		String Admin_Id="admin";
		String Admin_Password="admin";
		System.out.println("\t[:::::Admin Login:::::]");
		System.out.print("Enter Admin Id: ");
		String User= input.nextLine();
		System.out.print("Enter Admin Password: ");
		String pass=input.nextLine();
		if(Admin_Id.equals(User)&&Admin_Password.equals(pass))
		{
         try
	     {
			File file1=new File("database.txt");
			FileWriter m=new FileWriter(file1, true);

		   while(choice)
		   {
			System.out.println();
            System.out.println("Here are Some Options for You: \n");
			System.out.println();

			System.out.println("	1. Booking Management");
			System.out.println("	2. Payment management");
			System.out.println("	3. Show all account details");
			System.out.println("	4. Exit the Application\n");
			System.out.print("What do you want to do? : ");
			
			int f = input.nextInt();
			
			switch(f)
			{
				
				case 1:
				    System.out.println();
					System.out.println("You have selected to 'Booking Management'");
					System.out.println();

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New account");
					System.out.println("	2. Remove Existing account");
					System.out.println("	3. See all account");
					System.out.println("	4. Go Back\n");
					System.out.print("What do you want to do? : ");
					int s1 = input.nextInt();
					
					switch(s1)
					{
						case 1:
                            System.out.println();
						    System.out.println(" You have selected to 'Create New account'");
                            System.out.println();
							System.out.print("Enter Booking Type(Planner/Customer): ");
							String book_type = input.next();
							System.out.print("Enter id: ");
							int book_id = input.nextInt();
							System.out.print("Enter name: ");
							String bookbyname = input.next();
							System.out.print("Enter number: ");
							String bookbynumber = input.next();
							System.out.print("Enter Email: ");
							String bookbyemail = input.next();
							System.out.print("Enter Address: ");
							String bookbyadd = input.next();

							
							System.out.print("Enter Booking Date: ");
							String book_date = input.next();
							
							
							
							Booking b = new Booking();
							b.setBook_name(bookbyname);
							b.setbook_Number(bookbynumber);
							b.setBook_email(bookbyemail);
							b.setBookAddress(bookbyadd);
							b.setBook_id(book_id);
							b.setBook_date(book_date);
							b.setBook_type(book_type);
					

							wp.insertBooking(b);

							

							m.write("\nBooked Data\nBooking Type: "+book_type+"\nbooking id: "+book_id+"\nName:"+bookbyname+"\nNumber:"+bookbynumber+"\nBooking Date: "+book_date+"\n\n");
							m.flush();
							
							
							break;
							
						case 2:
						    System.out.println();
                            System.out.println("You have selected to 'Remove Existing account'");
                            System.out.println();
							System.out.print("Enter Booking id: ");
							int book_id1 = input.nextInt();
							
							wp.removeBooking(wp.getBook(book_id1));
							break;
						
						case 3:
						    System.out.println();
                            System.out.println("You have selected to 'See all account'");
                            System.out.println();
							wp.showBookedCustomers();
							break;
						
						case 4:
						
							System.out.println("Going Back . . .");
							break;
							
						default:
						
							System.out.println("Invalid Input");
							break;
					}
					
					break;
				
					
				case 2:
				    System.out.println();
					System.out.println("You have selected to 'Payment Management'");
                    System.out.println();
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create payment id");
					System.out.println("	2. Transfer balance");
					System.out.println("	3. Go Back\n");
					System.out.print("What do you want to do? : ");
					int s2 = input.nextInt();
					
					switch(s2)
					{
						case 1:
                            System.out.println();
							System.out.println(" You have selected to 'Create payment id'");
                            System.out.println();
                            Payment p=null;
							
							System.out.print("Enter payment id: ");
							int an1 = input.nextInt();
							System.out.print("Enter main Balance: ");
							double b1 = input.nextDouble();

							Addamount ad = new Addamount();
							ad.setPayID(an1);
							ad.setBalance(b1);
								
							p = ad;
								
							
							if(p!=null)
							{
								System.out.print("Enter booking id (Planner/Customer): ");
								int book_id = input.nextInt();
								wp.getBook(book_id).insertPayment(p);
							}
							break;
						
						case 2:
                            System.out.println();
						    System.out.println("You have selected to 'Transfer balance'");
                            System.out.println();
							System.out.print("Enter Booking id: ");
							int bid1 = input.nextInt();
							System.out.print("Enter customar payment id: ");
							int usid = input.nextInt();
							System.out.print("Enter Transfer Amount: ");
							double amount = input.nextDouble();
							System.out.print("Enter Receiving planner id: ");
							int plid = input.nextInt();
							System.out.print("Enter receiving planner payment id: ");
							int uid = input.nextInt();
							
							wp.getBook(bid1).getPayment(usid).transfer(wp.getBook(plid).getPayment(uid), amount);
							m.write("\nPayment Data\n\nBooking id: "+bid1+"\ncustomer payment id: "+usid+"\npaid amount: "+amount+"\nPlanner id: "+plid+"\nPlanner payment id: "+uid+"\n\n");
							m.flush();
							m.close();

							break;
						
						case 3:
						    System.out.println();
							System.out.println("You have Selected to 'Go Back'");
                            System.out.println();
							break;
							
						default:
						
							System.out.println("Invalid Input");
							break;
					}
					
					
					break; 

				case 3:
                    System.out.println();
                    System.out.println(" You have selected to 'Show all account details'");
                    System.out.println();
					Scanner myReader=new Scanner(file1);
					while(myReader.hasNextLine())
					{
						String data=myReader.nextLine();
						System.out.println(data);
				    }
				
					break;
					
				case 4:
					System.out.println();
					System.out.println("You have selected to exit the application");
                    System.out.println();
					System.out.println("Thank you for using this application");
					choice = false;
					break;
					
				default:
				
					System.out.println("Invalid Input");
					break;
			    }
		    }
		}
			catch (Exception e) 
			{
                System.out.println("\n\nWrong Typing");
		 	}
	    }
	
	else
	
	System.out.println("\nUnsuccessfully Login");
	}
}
