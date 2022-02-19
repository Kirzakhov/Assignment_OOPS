package assignment;

class Customer1{
	private String name;
	private boolean member;
	private String memberType;
	public Customer1() {
		this.member = false;
	}
	public Customer1(String name) {
		this.member = false;
		this.name = name;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Customer[name="+this.name+" isMember="+this.member+" memberType="+
				this.memberType+"]";
	}
}

class DiscountRate{
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;
	public double getServiceDiscountRate(String type) {
		if(type.equalsIgnoreCase("Premium"))
			return serviceDiscountPremium;
		else if(type.equalsIgnoreCase("Gold"))
			return serviceDiscountGold;
		else if(type.equalsIgnoreCase("Silver"))
			return serviceDiscountSilver;
		return 0;
	}
	public double getProductDiscountRate(String type) {
		if(type.equalsIgnoreCase("Premium"))
			return productDiscountPremium;
		else if(type.equalsIgnoreCase("Gold"))
			return productDiscountGold;
		else if(type.equalsIgnoreCase("Silver"))
			return productDiscountSilver;
		return 0.1;
	}
}

class Visit{
	private Customer1 customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	public Visit(Customer1 customer, Date date) {
		this.customer = customer;
		this.date = date;
	}
	public String getName() {
		return customer.getName();
	}
	public double getServiceExpense() {
		return serviceExpense;
	}
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	public double getProductExpense() {
		return productExpense;
	}
	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	public double getTotalExpense() {
		return productExpense + serviceExpense;
	}
	public String toString() {
		return "Visit["+super.toString()+",date="+this.date+",serviceExpense="+this.serviceExpense
				+",product="+this.productExpense+"]";
	}
}

public class CustomerDiscountVisit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
