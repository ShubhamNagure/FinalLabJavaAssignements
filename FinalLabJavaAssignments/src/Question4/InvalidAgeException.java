package Question4;

public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		System.out.println("Age must be > 60");
	}
}
