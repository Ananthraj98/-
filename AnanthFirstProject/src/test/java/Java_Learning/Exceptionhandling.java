package Java_Learning;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            int result = 10 / 0; // Division by zero
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception caught: " + e.getMessage());
	        } finally {
	            System.out.println("Always execute the finally block.");
	        }
	    }
	}