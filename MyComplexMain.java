package assignment;

class MyComplex{
	private double real;
	private double imag;
	public MyComplex() { }
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	public String toString() {
		return this.real+"+"+this.imag+"i";
	}
	public boolean isReal() {
		return this.imag == 0.0;
	}
	public boolean isImaginary() {
		return this.real == 0.0;
	}
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	public boolean equals(MyComplex another) {
		return (this.real == another.real && this.imag == another.imag);
	}
	public double magnitude() {
		return Math.sqrt(this.real*this.real + this.imag*this.imag);
	}
	public MyComplex addInto(MyComplex right) {
		this.real += right.real;
		this.imag += right.imag;
		return this;
	}
	public MyComplex addNew(MyComplex right) {
		right.real += this.real;
		right.imag += this.imag;
		return new MyComplex(right.real, right.imag);
	}
	public double argument() {
		return Math.atan2(this.imag, this.real);
	}
	public MyComplex subtract(MyComplex right) {
		this.real -= right.real;
		this.imag -= right.imag;
		return this;
	}
	public MyComplex subtractNew(MyComplex right) {
		right.real -= this.real;
		right.imag -= this.imag;
		return new MyComplex(right.real, right.imag);
	}
	public MyComplex multiply(MyComplex right) {
		this.real = this.real*right.real - this.imag*right.imag;
		this.imag = this.real*right.imag + this.imag*right.real;
		return this;
	}
	public MyComplex divide(MyComplex right) {
		this.real = (this.real*right.real+this.imag*right.imag)/
				(right.real*right.real+right.imag*right.imag);
		this.imag = (this.imag*right.real-this.real*right.imag)/
				(right.real*right.real+right.imag*right.imag);
		return this;
	}
	public MyComplex conjugate() {
		this.imag = -this.imag;
		return this;
	}
}

public class MyComplexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComplex mc = new MyComplex(2.3, 4.2);
		System.out.println(mc);
		System.out.println(mc.isImaginary());
		System.out.println(mc.equals(2.3, 4.2));
		MyComplex mc1 = new MyComplex();
		mc1.setReal(1.2);
		System.out.println(mc1);
		System.out.println(mc1.isReal());
		System.out.println(mc.equals(mc1));
		mc1.setValue(2.3, 4.2);
		System.out.println(mc.equals(mc1));
		MyComplex mc2 = new MyComplex(2.0, 1.2);
		System.out.println(mc.subtract(mc2));
		System.out.println(mc.addNew(mc2));
		System.out.println(mc.magnitude());
		System.out.println(mc.argument());
		System.out.println(mc.multiply(mc1));
		System.out.println(mc.divide(mc2));
		System.out.println(mc.conjugate());
	}

}
