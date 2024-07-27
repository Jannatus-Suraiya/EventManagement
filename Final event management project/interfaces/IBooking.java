package interfaces;
import classes.*;
public interface IBooking
{
	void insertBooking(Booking b);
	void removeBooking(Booking b);
	Booking getBook(int book_id);
	void showBookedCustomers();
}