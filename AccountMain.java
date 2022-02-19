package assignment;

class Account{
	private String id;
	private String name;
	private int balance;
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int a) {
		balance += a;
		return balance;
	}
	public int debit(int a) {
		if(a>this.balance)
			System.out.println("Amount exceeded balance");
		else
			this.balance -= a;
		return this.balance;
	}
	public int transferTo(Account ac, int a) {
		if(a>this.balance)
			System.out.println("Amount exceeded balance");
		else {
			this.balance -= a;
			ac.balance += a;
		}
		return this.balance;
	}
	public String toString() {
		return "Account[id="+this.id+" name="+this.name+" balance="+this.balance+"]";
	}
}

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Account a1 = new Account("A101", "Tan Ah Teck", 88);
	      System.out.println(a1);  
	      Account a2 = new Account("A102", "Kumar"); 
	      System.out.println(a2);
	      System.out.println("ID: " + a1.getId());
	      System.out.println("Name: " + a1.getName());
	      System.out.println("Balance: " + a1.getBalance());
	      a1.credit(100);
	      System.out.println(a1);
	      a1.debit(50);
	      System.out.println(a1);
	      a1.debit(500);  
	      System.out.println(a1);
	      a1.transferTo(a2, 100);
	      System.out.println(a1);
	      System.out.println(a2);

	}

}
