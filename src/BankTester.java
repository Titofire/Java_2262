/**
*
*/
public class BankTester {
/**
* @param args
*/
public static void main(String[] args) {
BankAccounT asa = new BankAccounT("Asa", 1000);
BankAccounT mason = new BankAccounT("Mason");
BankAccounT hannah = new BankAccounT("Hannah", -300);
mason.deposit(5);
System.out.println("Asa's balance: " + asa.getBalance());
System.out.println("Mason's balance: " + mason.getBalance());
System.out.println("The bank has: " + BankAccounT.getTotalAssets());
System.out.println("Asa: " + asa);
System.out.println("Mason: " + mason);
}
}
