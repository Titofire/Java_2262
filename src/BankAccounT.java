/**
 * Class to model a bank account.  Accounts have a balance, and
 * can be of type savings accounts or checking accounts.  Accounts
 * also have owners and account numbers that are unique across all 
 * possible bank accounts
 * 
 * @author Leslie Damon
 * @version 1.0
 */
public class BankAccounT {
	
	private String _owner;
	private int _accountNumber;
	private double _balance;
	private boolean _isChecking;  // true if is a checking account, false if savings
	
	private static int nextAccountNumber = 1001;
	private static double totalBankAssets = 0;
	
	/**
	 * constructor to create an Account, given an owner
	 * @param owner entity that will own the account
	 */
	public BankAccounT(String owner) {
		
		this(owner, 0);
//		_owner = owner;
//		_balance = 0;
//		_accountNumber = getAccountNumber();				
	}
	
	/**
	 * constructor to create an Account, given an owner
	 * @param owner entity that will own the account
	 * @param initialBalance  the initial balance when the account is opened
	 */
	public BankAccounT(String owner, double initialBalance) {
		_owner = owner;
		if (initialBalance > 0)
			_balance = initialBalance;
		else
			_balance = 0;
		_isChecking = true;
		totalBankAssets += _balance;

		_accountNumber = getNextAccountNumber();				
	}
	
	/**
	 * Gets the account number of the account
	 * @return the account number
	 */
	public int getAccountNumber() {
		return _accountNumber;
	}
	/**
	 * gets the balance in the account at this time
	 * @return the balance
	 */
	public double getBalance() {
		return _balance;
	}
	
	/**
	 * withdraw the requested amount from the account.  If the 
	 * amount requested is larger than the balance, the full balance
	 * will be withdrawn
	 * @param amt the amount to withdraw
	 * @return the amount withdrawn, -1 if an illegal amount requested
	 * 
	 */
	public double withdraw(double amt) {
		double amountWithdrawn=0;
		
		if (amt >= 0) {
			if (amt <= _balance) {
				_balance -= amt;
			}
			else{
				amountWithdrawn= _balance;
			}
			_balance -= amountWithdrawn;
			totalBankAssets -= amountWithdrawn;
		}
		else {
			// amount was < 0
			amountWithdrawn = -1;
		}
		return amountWithdrawn;
	}
	
	/**
	 * deposit money into the account
	 * @param amt amount of money being deposited
	 */
	public void deposit(double amt) {
		if (amt >= 0) {
			_balance += amt;
			totalBankAssets += amt;
		}
	}
	
		
	private int getNextAccountNumber() {
		int number = nextAccountNumber;
		nextAccountNumber++;
		return number;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "Account: " + _accountNumber + " owned by: " + _owner;
		// maybe or maybe not....
		result += "\n     Balance: $" + _balance;
		return result;
	}
	
	/**
	 * gets the total assets held by the bank
	 * @return the total
	 */
	public static double getTotalAssets() {
		return totalBankAssets;
	}
}

