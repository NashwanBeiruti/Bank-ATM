import java.util.HashSet;
@javax.jdo.annotations.PersistenceCapable
public class AccountHolder {
	String name;
	String address;
	String SSN;
	HashSet<Account> accounts=new HashSet<Account>();
	HashSet<BankCard> cards=new HashSet<BankCard>();
	public AccountHolder(String name, String address, String ssn) {
		this.name=name;
		this.address=address;
		this.SSN=ssn;
	}	
}
