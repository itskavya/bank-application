package bankaccountapp;

public abstract class Account implements IRate {
	
	private static String name;
	private String PAN;
	private static double balance;
	
	private static int index=10000;
	protected static String accountNumber;
	protected static double rate;
	
	public static Checking chacc;
	public static Savings savacc;
	
	public abstract void setRate();
	
	public Account(String name,String PAN,double initDeposit) {
		this.name= name;
		this.PAN=PAN;
		this.balance=initDeposit;
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
    }

	private String setAccountNumber() {
		String lastTwoOfPAN=PAN.substring(PAN.length()-2, PAN.length());
		int uniqueID=index;
		int randomNumber=(int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfPAN+uniqueID+randomNumber;
	}
	
	public void compound() {
		double accuredInterest=balance*(rate/100);
		balance=balance+accuredInterest;
		System.out.println("Accured interest: "+accuredInterest);
		printBalance();
	}

	public static void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Depositing"+amount);
		printBalance();
	}
	
	public static void withdraw(double amount) {
		if(amount>balance)
			System.out.println("INSUFFICIENT ACCOUNT BALANCE");
		else 
			balance =balance-amount;
			System.out.println("Withdrawing "+amount);
			printBalance();
	}
	
	public static void transfer(String toWhere, double amount) {
		if(amount>balance)
			System.out.println("INSUFFICIENT ACCOUNT BALANCE");
		else
			balance=balance-amount;
			System.out.println("Transfering Rs."+ amount +"to"+toWhere);
			printBalance();
	}
	
	public static void printBalance() {
		System.out.println("Your Balance is now:Rs" +balance);
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT CREATED SUCCESSFULLY!\nACCOUNT HOLDER NAME:" +name+"\nACCOUNT NUMBER:"+accountNumber+"\nBALANCE:"+balance +"\nRATE: "+rate+"%");
	}

}

