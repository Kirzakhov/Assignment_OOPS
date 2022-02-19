package assignment;

class MyAuthor{
	private String name;
	private String email;
	public MyAuthor(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Author[name="+this.name+",email="+this.email+"]";
	}
}

class MyBook{
	private String isbn;
	private String name;
	private MyAuthor author;
	private double price;
	private int qty;
	public MyBook(String isbn, String name, MyAuthor author, double price) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public MyBook(String isbn, String name, MyAuthor author, double price, int qty) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getName() {
		return name;
	}
	public MyAuthor getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getAuthorName() {
		return this.author.getName();
	}
	public String toString() {
		return "Book[isbn="+this.isbn+",name="+this.name+","+this.author+",price="+this.price+",qty="
				+this.qty+"]";
	}
}

public class MyAuthorAndBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MyAuthor a1 = new MyAuthor("Tan Ah Teck", "ahteck@nowhere.com");
	      System.out.println(a1);

	      a1.setEmail("ahteck@somewhere.com");
	      System.out.println(a1);
	      System.out.println("name is: " + a1.getName());
	      System.out.println("email is: " + a1.getEmail());

	      
	      MyBook b1 = new MyBook("12345", "Java for dummies", a1, 8.8, 88);
	      System.out.println(b1);

	      b1.setPrice(9.9);
	      b1.setQty(99);
	      System.out.println(b1);
	      System.out.println("isbn is: " + b1.getIsbn());
	      System.out.println("name is: " + b1.getName());
	      System.out.println("price is: " + b1.getPrice());
	      System.out.println("qty is: " + b1.getQty());
	      System.out.println("author is: " + b1.getAuthor());  // Author's toString()
	      System.out.println("author's name: " + b1.getAuthorName());
	      System.out.println("author's name: " + b1.getAuthor().getName());
	      System.out.println("author's email: " + b1.getAuthor().getEmail());

	}

}
