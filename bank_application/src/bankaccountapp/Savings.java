package bankaccountapp;

public class Savings extends Account {
	
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;

	public Savings(String name, String PAN, double initDeposit) {
		super(name,PAN,initDeposit);
		accountNumber="1"+accountNumber;
	    setSafetyDepositBox();
	    showInfo();
	}
	
	public void setRate() {
		rate= getBaseRate()-0.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID=(int)(Math.random()* Math.pow(10, 3));
		safetyDepositBoxKey=(int)(Math.random()* Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE:CURRENT");
		System.out.println("YOUR CURRENT ACCOUNT DETAILS ARE:**please remember the following for further Transactions**\n**never share these details*"+"\nSAFETY DEPOSIT BOX ID:"+safetyDepositBoxID+"\nSAFETY DEPOSIT BOX PIN"+safetyDepositBoxKey);
	}

	
}

