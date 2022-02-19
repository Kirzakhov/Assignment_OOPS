package assignment;

class Book1{
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	public Book1(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public Book1(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author[] getAuthors() {
		return authors;
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
	public String toString() {
		return "Book[name="+this.name+",authors={"+this.getAuthorsStr()+"},price="+this.price+
				",qty="+this.qty+"]";
	}
	public String getAuthorsStr() {
		String s = "";
		for(int i = 0; i < this.authors.length; i++) {
			if(i==0)
				s += this.authors[i];
			else
				s += "," + this.authors[i];
		}
		return s;
	}
	public String getAuthorNames() {
		String s = "";
		for(int i = 0; i < this.authors.length; i++) {
			if(i==0)
				s += this.authors[i].getName();
			else
				s += "," + this.authors[i].getName();
		}
		return s;
	}
}

public class AuthorAndBookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
		Book1 javaDummy = new Book1("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);
		System.out.println(javaDummy.getAuthorNames());
	}

}
