import javax.jdo.PersistenceManager;
import java.util.*;
import com.objectdb.Utilities;
import java.util.Comparator;
public abstract class CreateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder ah1=new AccountHolder("Jane Smith","100 Main St, Flushing, NY", "123456789");
		Account a1= new Account("87654008","1000.00");
		Account a2= new Account("14358055","7000.00");
		//ah1.accounts.add(a1);
		//ah1.accounts.add(a2);		
		ATM atm1=new ATM("20001111");
		BankCard bc1=new BankCard("8765098724357651","745","60094",59,23,01,10,2020);
		
		
		Branch b1=new Branch("20022","Hillside", "200 Hillside St, Flushing, NY");		
		CashDeposit cd=new CashDeposit("CD898760abc65","1000.00","4000.00",15, 9,01,03,2018, bc1, a1, atm1,b1);
		
		CashWithdrawal cw1=new CashWithdrawal("CW10000xyz897","2000.00","2000.00", 30,10,15,03,2018, bc1, a1, atm1,b1 );
		Transfer t1=new Transfer("T5437865sss765","1000.00","1000.00","7000.00",45,15,01,04,2018, bc1, a1,a2, atm1,b1);

		

		
		
		PersistenceManager pm = Utilities.getPersistenceManager("bank.odb");
		pm.currentTransaction().begin();
		pm.makePersistent(ah1);
		pm.makePersistent(a1);
		pm.makePersistent(a2);
		pm.makePersistent(atm1);
		pm.makePersistent(bc1);
		pm.makePersistent(b1);
		pm.makePersistent(cd);
		pm.makePersistent(cw1);
		pm.makePersistent(t1);
		pm.currentTransaction().commit();
		
		pm.currentTransaction().begin();
		ah1.accounts.add(a1);
		ah1.accounts.add(a2);
		b1.ATMs.add(atm1);
		a1.account.add(cd);
		a1.account.add(cw1);
		a1.account.add(t1);
		a2.account.add(t1);
		a1.accounts.add(ah1);
		a2.accounts.add(ah1);
		pm.currentTransaction().commit();
		
		
		pm.currentTransaction().begin();
		atm1.ATMUsed.add(cd);
		atm1.ATMUsed.add(cw1);
		atm1.ATMUsed.add(t1);
		
		bc1.cardUsed.add(cd);
		bc1.cardUsed.add(cw1);
		bc1.cardUsed.add(t1);
		pm.currentTransaction().commit();
		
		
	}

}
