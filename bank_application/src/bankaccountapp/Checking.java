package bankaccountapp;

public class Checking extends Account {
 
	private int debitCardNumber;
	private int debitCardPIN;
	
	public Checking(String name,String PAN,double initDeposit) {
		super(name,PAN,initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
		showInfo();
	}
	
	public void setRate() {
		rate= getBaseRate()*0.15;
	}
	
	private void setDebitCard() {
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPIN=(int)(Math.random()*Math.pow(10,4));
    }
	
	public void showInfo() {
		super.showInfo();
		System.out.println("YOUR SAVINGS ACCOUNT DETAILS ARE:\n**please remember the following for further Transactions**\n**never share these details*"+"\nDEBIT CARD NUMBER:"+debitCardNumber+"\nDEBIT CARD PIN:"+debitCardPIN);
	}
}
