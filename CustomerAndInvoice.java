package assignment;

class Invoice{
	private int id;
	private Customer customer;
	private double amount;
	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	public int getCustomerId() {
		return customer.getId();
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public double getAmountAfterDiscount() {
		this.amount = this.amount - this.amount*this.getCustomerDiscount()/100;
		return this.amount;
	}
	public String toString() {
		return "Invoice[id="+this.id+",customer="+this.getCustomer()+",amount="+this.getAmount()+"]";
	}
}

class Customer{
	private int id;
	private String name;
	private int discount;
	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return this.name+"("+this.id+")"+"("+this.discount+"%)";
	}
}

public class CustomerAndInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Customer c1 = new Customer(88, "Tan Ah Teck", 10);
	      System.out.println(c1);  // Customer's toString()

	      c1.setDiscount(8);
	      System.out.println(c1);
	      System.out.println("id is: " + c1.getId());
	      System.out.println("name is: " + c1.getName());
	      System.out.println("discount is: " + c1.getDiscount());

	      // Test Invoice class
	      Invoice inv1 = new Invoice(101, c1, 888.8);
	      System.out.println(inv1);

	      inv1.setAmount(999.9);
	      System.out.println(inv1);
	      System.out.println("id is: " + inv1.getId());
	      System.out.println("customer is: " + inv1.getCustomer());  // Customer's toString()
	      System.out.println("amount is: " + inv1.getAmount());
	      System.out.println("customer's id is: " + inv1.getCustomerId());
	      System.out.println("customer's name is: " + inv1.getCustomerName());
	      System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
	      System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());

	}

}
