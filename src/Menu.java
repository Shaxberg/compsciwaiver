import java.util.Random;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Menu myMenu = new Menu();
		Scanner myScan = new Scanner(System.in);
		String userChoice = "";
		
		while (userChoice.equals("9") == false) {
			myMenu.displayMenu();
			userChoice = myScan.nextLine();
			if (userChoice.equals("1")){
				// comboString
				System.out.println("Please enter the first string: ");
				String firstString = myScan.nextLine();
				System.out.println("Please enter the second string: ");
				String secondString = myScan.nextLine();
				System.out.println("comboString output: " + myMenu.comboString(firstString, secondString));
			}
			else if (userChoice.equals("2")){
				// nearHundred
				System.out.println("Please enter an integer: ");
				int userInt = Integer.parseInt(myScan.nextLine());
				System.out.println("nearHundred output: " + myMenu.nearHundred(userInt));
			}
			else if (userChoice.equals("3")){
				// sumDouble
				System.out.println("Please enter the first number: ");
				int firstInt = Integer.parseInt(myScan.nextLine());
				System.out.println("Please enter the second number: ");
				int secondInt = Integer.parseInt(myScan.nextLine());
				System.out.println("sumDouble output: " + myMenu.sumDouble(firstInt, secondInt));
			}
			else if (userChoice.equals("4")){
				// sumNumbers
				System.out.println("Please enter an integer: ");
				int userInt = Integer.parseInt(myScan.nextLine());
				System.out.println("sumNumbers output: " + myMenu.sumNumbers(userInt));
			}
			else if (userChoice.equals("5")){
				// getBMI
				System.out.println("Please enter a value for height: ");
				double height = Double.parseDouble(myScan.nextLine());
				System.out.println("Please enter a value for weight: ");
				double weight = Double.parseDouble(myScan.nextLine());
				System.out.println("getBMI output: " + myMenu.getBMI(height, weight));
			}
			else if (userChoice.equals("6")){
				// fahrenheit
				System.out.println("Please enter a value for Celcius: ");
				int celcius = Integer.parseInt(myScan.nextLine());
				System.out.printf("Fahrenheit output: %.1f\n", myMenu.Fahrenheit(celcius));
			}
			else if (userChoice.equals("7")){
				/// flipCoin
				System.out.println("Flipping coin...");
				myMenu.flipCoin();
			}
			else if (userChoice.equals("8")){
				// sumDigits
				System.out.println("Please enter an integer: ");
				int userInt = Integer.parseInt(myScan.nextLine());
				System.out.println("sumDigits output: " + myMenu.sumDigits(userInt));
			}
			else if (userChoice.equals("9")){
				System.out.println("Exiting...");
			}
			else{
				System.out.println("Please enter a valid input.");
			}
		}
		
		System.out.println("Thanks for playing!");
		myScan.close();
	}
	public String comboString(String a, String b) {
		if (a.length() > b.length()){
			return b + a + b;
		}
		else{
			return a + b + a;
		}
	}
	public boolean nearHundred (int n) {
		if (Math.abs(n - 100) <= 10){
			return true;
		}
		else{
			return false;
		}
	}
	public int sumDouble(int a, int b) {
		if (a == b){
			return 2*(a+b);
		}
		else{
			return a+b;
		}
	}
	public int sumNumbers(int a){
		int numSum = 0;
		while (a > 0){
			numSum += a;
			a--;
		}
		/*
		 * for (int i = a; i > 0; i--){
			numSum += i;
			}
		 */
		return numSum;
	}
	public double getBMI (double height, double weight){
		return (weight * 703) / Math.pow(height, 2.0);
	}
	public double Fahrenheit(double a){
		return (5.0/9.0) * (a - 32);
	}
	public void flipCoin(){
		Random gen = new Random();
		int rand;
		for (int i = 0; i < 20; i++){
			rand = gen.nextInt(2);
			if (rand == 1){
				System.out.println("Heads");
			}
			else{
				System.out.println("Tails");
			}
		}
	}
	public int sumDigits(int a){
		int numSum = 0;
		while (a > 0){
			// Get ones place value, add to numSum
			numSum += a%10;
			// Move one place to the left
			a /= 10;
			}
		return numSum;
	}
	public void displayMenu(){
		// Displays the menu for the user
		System.out.println("==================================");
		System.out.println("Please select from the following:");
		System.out.println("1 - comboString");
		System.out.println("2 - nearHundred");
		System.out.println("3 - sumDouble");
		System.out.println("4 - sumNumbers");
		System.out.println("5 - getBMI");
		System.out.println("6 - fahrenheit");
		System.out.println("7 - flipCoin");
		System.out.println("8 - sumDigits");
		System.out.println("9 - Exit");
		System.out.println("==================================");
	}
}
