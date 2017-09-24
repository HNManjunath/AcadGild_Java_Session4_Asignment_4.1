/**
 * 
 */
package assignment4_1;

/**
 * @author MANJUNATH, below class is to demonstrate the method overloading
 *         functionality.
 *
 */
public class MethodOverloading {

	// Overloaded Method
	public int add(int numberOne, int numberTwo) {
		int result = numberOne + numberTwo;
		return result;
	}

	// Overloaded Method
	public int add(int numberOne, int numberTwo, int numberThree) {
		int result = numberOne + numberTwo + numberThree;
		return result;
	}

	// Main Function
	public static void main(String[] args) {
		MethodOverloading overloading = new MethodOverloading();
		System.out.println("Addition Result of 2 values " + overloading.add(100, 300));
		System.out.println("Addition Result of 3 values " + overloading.add(100, 300, 400));
	}

}