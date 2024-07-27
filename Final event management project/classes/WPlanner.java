package  classes;
import java.lang.*;
import interfaces.*;

public class WPlanner  implements IBooking
{
	private Booking b1[] = new Booking [500];


	
	public void insertBooking(Booking b)
	{
		int flag = 0;
		for(int i=0; i<b1.length; i++)
		{
			if(b1[i] == null)
			{
				b1[i] = b;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Successfully booked");
		}
		else
		{
			System.out.println("Can Not booked");
		}
	}
	
	public void removeBooking(Booking b)
	{
		int flag = 0;
		for(int i=0; i<b1.length; i++)
		{
			if(b1[i] ==  b)
			{
				b1[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("successfully Removed");}
		else{System.out.println("Can Not Remove");}
	}
	public void showBookedCustomers()
	{
		for(Booking b : b1)
		{
			if(b != null)
			{
				System.out.println("----------------------------------");
				System.out.println("Booked id: "+ b.getBook_id());
				System.out.println("Booked Name: "+ b.getBook_name());
				System.out.println("Booked Number: "+ b.getbook_Number());
				System.out.println("Booked email: "+ b.getBook_email());
				System.out.println("Booking Date: "+ b.getBook_date());
				System.out.println("Booked Type: "+ b.getBook_type());
				System.out.println("----------------------------------");
				b.showAllPayments();
				System.out.println("----------------------------------");
			}
		}
	}
	public Booking getBook(int book_id)
	{
		Booking b = null;
		
		for(int i=0; i<b1.length; i++)
		{
			if(b1[i] != null)
			{
				if(b1[i].getBook_id() == book_id)
				{
					b = b1[i];
					break;
				}
			}
		}
		if(b != null)
		{
			System.out.println("Booked Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		return b;
	}
}