/**
 * 
 */
package assignment4_1;

/**
 * @author MANJUNATH, below class is to demonstrate the method overriding
 *         functionality.
 *
 */
// Class Extended MethodOverriding Class
class Maruti extends MethodOverriding {
	public void getCar() { // Override method
		System.out.println("Maruthi Suzuki Swift");
	}
}

// Class Extended MethodOverriding Class
class Ford extends MethodOverriding {
	public void getCar() { // Override method
		System.out.println("Ford Ecosport");
	}
}

// Main Class
public class MethodOverriding {
	public void getCar() { // Override method
		System.out.println("Method Overriding");
	}

	// Main Function
	public static void main(String[] args) {
		MethodOverriding methodOverriding = new MethodOverriding();
		MethodOverriding maruti = new Maruti();
		MethodOverriding ford = new Ford();

		methodOverriding.getCar();
		maruti.getCar();
		ford.getCar();
	}
}