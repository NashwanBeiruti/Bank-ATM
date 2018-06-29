import java.util.HashSet;
@javax.jdo.annotations.PersistenceCapable
public class ATM {
	public ATM(String id) {
		this.IDcode=id;
	}
	String IDcode;
	Branch ATMs;
	HashSet<ATMTransaction> ATMUsed= new HashSet<ATMTransaction>();


}
