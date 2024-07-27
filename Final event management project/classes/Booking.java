package classes;
import java.lang.*;
import interfaces.*;

public class Booking implements IPayment
{
   private String name;
   private String number;
   private String email;
   private String address;
   private int book_id;
   private String book_date;
   private String book_type;
   private Payment pay[]=new Payment[100];

   public Booking(){}


   Booking(String name, String number, String email,String address,int book_id,String book_date,String book_type)
   {
       this.name=name;
	   this.number=number;
	   this. email=email;
	   this.address=address;  
	   this.book_id=book_id;
       this.book_date=book_date;
       this.book_type=book_type;
   }

   public void setBook_name(String name)
   {
       this.name=name;
   }
   public void setbook_Number(String number)
   {
       this.number=number;;
   }
   public void setBook_email(String email)
   {
       this.email=email;
   }
   public void setBookAddress(String address)
   {
       this.address=address;
   }

   public void setBook_id(int book_id)
   {
       this.book_id=book_id;
   }

   public void setBook_date(String book_date)
   {
       this.book_date=book_date;
   }

   public void setBook_type(String book_type)
   {
       this.book_type=book_type;
   }

   

   public int getBook_id()
   {
       return book_id;
   }

   public String getBook_date()
   {
       return book_date;
   }

   public String getBook_type()
   {
       return book_type;
   }

   

   public String getBook_name()
   {
	   return name;
   }

   public String getbook_Number()
   {
	   return number;
   }

   public String getBook_email()
   {
	   return email;
   }

   public String getBookAddress()
   {
	   return address;
   }

  public void insertPayment(Payment p)
	{
		int flag = 0;
		for(int i=0; i<pay.length; i++)
		{
			if(pay[i] == null)
			{
				pay[i] = p;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("payment Account Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	public void removePayment(Payment p)
	{
		int flag = 0;
		for(int i=0; i<pay.length; i++)
		{
			if(pay[i] == p)
			{
				pay[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("payment Account Removed");}
		else{System.out.println("Can Not Remove");}
	}
	public void showAllPayments()
	{
		for(Payment p : pay)
		{
			if(p != null)
			{
				p.showInfo();
			}
		}
	}
	public Payment getPayment(int payment_id)
	{
		Payment p = null;
		
		for(int i=0; i<pay.length; i++)
		{
			if(pay[i] != null)
			{
				if(pay[i].getPayID() == payment_id)
				{
					p = pay[i];
					break;
				}
			}
		}
		if(p != null)
		{
			System.out.println("pay id Found");
		}
		else
		{
			System.out.println("pay id Not Found");
		}
		return p;
	}


}