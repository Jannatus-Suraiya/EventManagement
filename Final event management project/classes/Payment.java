package  classes;
import java.lang.*;
import interfaces.*;

public abstract class Payment implements ITransactions
{
	protected int payment_id;
	protected double balance;
	
	public void setPayID(int payment_id)
	{
		this.payment_id = payment_id;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public int getPayID()
	{
		return payment_id;
	}

	public double getBalance()
	{
		return balance;
	}
	
	public abstract void showInfo();
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			System.out.println("Main Balance: "+ balance);
			System.out.println("Added Amount: "+ amount);
			balance += amount;
			balance = balance + amount;
			System.out.println("Current Balance: "+ balance);
		}
		else
		{
			System.out.println("Can Not Added");
		}
	}
	
	public void transfer(Payment a, double amount)
	{
		if(amount>0 && amount<=balance)
		{
			System.out.println("Main customar Balance: "+ this.balance);
			System.out.println("Transfer to planner Amount: "+ amount);
			this.balance = this.balance - amount;
			a.balance = a.balance + amount;
			System.out.println("Current customer Balance: "+ this.balance);
		}
		else
		{
			System.out.println("Can Not Transfer");
		}
	}
	
}