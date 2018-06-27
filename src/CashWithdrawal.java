@javax.jdo.annotations.PersistenceCapable
public class CashWithdrawal extends ATMTransaction{

	public CashWithdrawal(String idcode, String amount, String balance, int i, int j, int k, int l, int m, BankCard bc1, Account a1, ATM atm1, Branch b1) {
		this.IDcode=idcode;
		this.amount=Float.parseFloat(amount);
		this.balance=Float.parseFloat(balance);
		this.timeDate=new TimeDate(i, j,k,l,m);
		this.cardUsed=bc1;
		this.account=a1;
		this.ATMUsed=atm1;
		this.ATMUsed.ATMs=b1;
	}

	@Override
	public int compareTo(ATMTransaction that) {
		if(this.timeDate.year>that.timeDate.year){
			return -1;
		}else if(this.timeDate.year <that.timeDate.year){
			return 1;
		}else if(this.timeDate.month >that.timeDate.month){
			return -1;
		}else if(this.timeDate.month <that.timeDate.month){
			return 1;
		}else if(this.timeDate.day >that.timeDate.day){
			return -1;
		}else if(this.timeDate.day <that.timeDate.day){
			return 1;
		}else if(this.timeDate.hour >that.timeDate.hour ){
			return -1;
		}else if(this.timeDate.hour  <that.timeDate.hour ){
			return 1;
		}else if(this.timeDate.minute >that.timeDate.minute ){
			return -1;
		}else if(this.timeDate.minute  <that.timeDate.minute ){
			return 1;
		}
		return this.IDcode.compareTo(that.IDcode);
	}

}
