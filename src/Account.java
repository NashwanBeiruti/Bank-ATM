import java.util.*;
@javax.jdo.annotations.PersistenceCapable
public class Account  {

	String number;
	float currentBalance;
	public Account(String number, String currentBalance) {
		this.number=number;
		this.currentBalance=Float.parseFloat(currentBalance);
	}	
	TreeSet<Transfer> targetAccount=new TreeSet<Transfer>();
	TreeSet<ATMTransaction> account=new TreeSet<ATMTransaction>();
	HashSet<AccountHolder> accounts=new HashSet<AccountHolder>();


}
