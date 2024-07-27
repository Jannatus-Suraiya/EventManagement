package interfaces;

import java.lang.*;
import classes.*;

public interface ITransactions
{
	void deposit(double amount);
	void transfer(Payment p, double amount);
}