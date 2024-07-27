package  classes;
import java.lang.*;
public class Addamount extends Payment
{
	private double paid_amount;
	
	public void setPaidamount(double paid_amount)
	{
		this.paid_amount = paid_amount;
	}
	public double getPaidamount()
	{
		return paid_amount;
	}
	public void showInfo()
	{
		
		System.out.println("Payment id: "+payment_id);
		System.out.println("Balance: "+balance);
		System.out.println("Paid amount: "+paid_amount);
		System.out.println();
	}
}