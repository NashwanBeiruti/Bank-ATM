@javax.jdo.annotations.PersistenceCapable
public class TimeDate {

	int minute;
	int hour;
	int day;
	int month;
	int year;
	public TimeDate(int m, int h, int d, int mm, int y) {
		this.minute=m;
		this.hour=h;
		this.day=d;
		this.month=mm;
		this.year=y;
		
	}	
}
