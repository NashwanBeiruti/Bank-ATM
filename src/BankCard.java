import java.util.HashSet;
import javax.jdo.*;
@javax.jdo.annotations.PersistenceCapable
public class BankCard {
	String number;
	String securityCode;
	String PIN;
	AccountHolder cards;
	HashSet<ATMTransaction> cardUsed=new HashSet<ATMTransaction>();
	TimeDate expirationDate;
	public BankCard(String number, String sc, String pin, int m, int h, int d, int mm, int y) {
		this.number=number;
		this.securityCode=sc;
		this.PIN=pin;
		expirationDate=new TimeDate(59,23,01,10,2020);
	}

}
