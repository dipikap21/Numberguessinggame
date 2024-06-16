import java.util.Scanner;

class NumberGussingGame {
	public static void main(String args[]) {

		int computerNumber = (int) (Math.random() * 100 + 1);
		int userNumber = 0;
		System.out.println("WELCOME IN MY NUMBER GUESSING GAME!!!");
		System.out.println("The correct guess would be::" + computerNumber);

		int count = 1;
		String msg;
		Scanner s1 = new Scanner(System.in);
		while (userNumber != computerNumber) {
			System.out.println("Enter the Guess Number between 1 to 100::");
			userNumber = s1.nextInt();

			msg = determineGuess(userNumber, computerNumber, count);
			System.out.println("Output::" + msg);
			count++;
		}
	}

	public static String determineGuess(int userNumber, int computerNumber, int count) {
		if (userNumber <= 0 && userNumber > 100) {
			return "Your guess is incorrect";

		} else if (userNumber == computerNumber) {
			return "Congratulations!!!\n Your guess is correct\n Total guess::" + count;
			
		} else if (userNumber > computerNumber) {
			return "Your guess is too high! Try Again ...Try Number::" + count;
		} else if (userNumber < computerNumber) {
			return "Your guess is too small !! Try Number::" + count;
		} else {
			return "Your guess is incorrect \n Try Number::" + count;
		}
	}
}