package interfaces;
import java.lang.*;
import classes.*;

public interface IPayment
{
	void insertPayment(Payment p);
	void removePayment(Payment p);
	Payment getPayment(int payment_id);
	void showAllPayments();
}