@javax.jdo.annotations.PersistenceCapable
public abstract class ATMTransaction implements Comparable<ATMTransaction>{
	Account account;
	BankCard cardUsed;
	ATM ATMUsed;
	TimeDate timeDate;
	String IDcode;
	float amount;
	float balance;
}
