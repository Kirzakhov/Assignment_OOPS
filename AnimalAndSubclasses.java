package assignment;

class Animal{
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	public String toString() {
		return "Animal[name="+this.name+"]";
	}
}

class Mammal extends Animal{
	public Mammal(String name) {
		super(name);
	}
	public String toString() {
		return "Mammal["+super.toString()+"]";
	}
}

class Cat extends Mammal{
	public Cat(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Meow");
	}
	public String toString() {
		return "Cat["+super.toString()+"]";
	}
}

class Dog extends Mammal{
	public Dog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog another) {
		System.out.println("Woooof");
	}
	public String toString() {
		return "Dog["+super.toString()+"]";
	}
}

public class AnimalAndSubclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat tom = new Cat("Tom");
		System.out.println(tom);
		Dog scoob = new Dog("Scoob");
		System.out.println(scoob);
		scoob.greets();
		Dog optimus = new Dog("Optimus");
		System.out.println(optimus);
		scoob.greets(optimus);
	}

}
