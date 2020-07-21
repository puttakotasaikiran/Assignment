package Assignment4;
public class Account {
	private long accountNo;
	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	private double balance;
	public double getBalance() { 
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double depositAmount)
	{
		this.balance=this.balance+depositAmount;
		return this.balance;
	}
	public void withDraw(double withdrawAmount)
	{
		if(this.balance>withdrawAmount)
		{
			this.balance=this.balance-withdrawAmount;
			
		}
		else
		{
			System.out.println("Insufficient Funds");
		}
	}
}