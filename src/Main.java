
public class Main {

	static double balance;

	public static void withdraw(int amount) throws IllegalInputException
											, InsufficientFundsException {

		if (amount <= 0)
			throw new IllegalInputException("Not enough cash");

		if (amount > balance) {
			throw new InsufficientFundsException("Not enough cash");
		}

	}

	public static void main(String... args) {

		try {
			withdraw(10);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
