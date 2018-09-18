//This class contains methods that perform various math operations
//@author Jon Lee
//@version September 6, 2018
public class Calculate {
	/*start a method by writing public static, 
	 * void if you don't want to return something, 
	 * and a data type if you do
	 * then lastly the name of the method 
	 * and the initialized argument and {
	 */
	public static int square(int number) {
		//returns the square of an inputted integer by multiplying it by itself
			return number*number;
	}
	public static double square(double number) {
		//returns the square of a number by multiplying it by itself
		return number*number;
	}
	public static int cube(int number) {
		//returns the cube of a number by multiplying it by two of itself
			return number*number*number;
	}
	public static double average(double num1, double num2) {
		//averages two numbers by adding them and dividing by two
		return (num1 + num2)/2;
	}
	public static double average(double num1, double num2, double num3) {
		//averages three numbers by adding them and dividing by three
		return (num1 + num2 + num3)/3;
	}
	public static double toDegrees(double num1) {
		//returns angle measure in radians to units of degrees
		return (num1)*180/3.14159;
	}
	public static double toRadians(double num1) {
		//converts degree value to units of radians
		return num1*3.14159/180;
	}
	public static double discriminant(double a, double b, double c) {
		//calculates the discriminant, which is used to determine how many
		//real roots a quadratic equation has
		return square(b) - 4*a*c;
	}
	public static String toImproperFrac(int wholenumber, int numerator, int denominator) {
		//converts mixed number to improper fraction using math rules
		int answer = wholenumber*denominator+numerator;
		return (answer+"/"+denominator);
	}
	public static String toMixedNum(int numerator, int denominator) {
		//converts an improper fraction to mixed number using math rules
		int wholenumber = numerator/denominator;
		//whole number is the result of division where the remainder is ignored
		if (wholenumber==0) {
			return ("That's not an improper fraction, your answer is "+numerator+"/"+denominator);
			//if the numerator is not greater than the denominator, returns error above
		}
		else {
			int remainder = numerator%denominator;
			//remainder uses mod (%) which gives only the remainder when dividing
			return (wholenumber+" "+remainder+"/"+denominator);
		}
	}
	public static String foil(int a, int b, int c, int d, String n) {
		//does foil operations, inner times inner and outer times outer, etc
		//returns the coefficients in standard form of quadratic equations
		int coefficient1 = a*c;
		int coefficient2 = a*d+b*c;
		int coefficient3 = b*d;
		return (coefficient1+n+"^2 + "+coefficient2+n+" + "+coefficient3);
	}
	public static boolean isDivisibleBy(int a, int b) {
		//if a divided by b has no remainder, it is divisible, so returns true
		//if not, returns false
		if (a*b < 0) {
			//only true if only one of a or b is negative, not both or neither
			System.out.println("That's not a positive integer, please give the right input.");
			return false;
			//return error message if incorrect input is given
		}
		else {
			if (a%b == 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static double absValue(double a) {
		//if a is negative, returns the opposite; 
		//if a is positive, returns a
		//either result is the positive value of a
		if (a <= 0) {
			return -1*a;
		}
		else {
			return a;
		}
	}
	public static double max(double a, double b) {
		//returns a if a is greater than b, b if b is greater
		if (a > b) {
			return a;
		}
		else if (a < b) {
			return b;
		}
		else {
			return a;
		}
	}
	public static double max(double a, double b, double c) {
		//returns a if a is greater than b and c, same for b or c
		if (a>b && a>c) {
			return a;
		}
		else if (b>a && b>c) {
			return b;
		}
		else if (c>a && c>b) {
			return c;
		}
		else if (b==c) {
			return b;
		}
		else {
			return a;
		}
	}
	public static int min(int a, int b) {
		//returns a if a is less or equal, b if b is less
		if (a<=b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static double round2 (double a) {
		int threedecimalplaces = (int) (1000*a);
		int twodecimalplaces = (int) (100*a);
		/*multiply the given by a thousand, then convert it to an int
		 *  so that the digits after the decimal point are truncated
		 * then divide by ten to see if the last digit is 
		 * greater than or equal to five, and if so round up, if not round down
		 * last, divide by a hundred using doubles division to return 
		 * the decimal place to its original spot 
		 */
				if (threedecimalplaces%10>=5) {
					return ((twodecimalplaces+1)/100.0);
				}
				else {
					return (twodecimalplaces/100.0);
				}
	}
	public static double exponent(double base, int power) {
		if (power <= 0) {
			System.out.println("That's not a positive integer, please give the right input.");
			return 0;
			//return error message if incorrect input is given
		}
		else {
			double answer = 1;
			for (int i = 0; i < power; i++) {
				//count up from 0 to the power value inputed
				answer = answer * base;
				/* for each count, answer multiplies by base
				 */
			}
			return answer;
		}
	}
	public static int factorial(int a) {
		if (a <= 0) {
			System.out.println("That's not a positive integer, please give the right input.");
			return 0;
			//return error message if incorrect input is given
		}
		else {
			for (int i = a-1; i > 0; i--) {
			//count down from given value to 1
				a = a*i;
			/*for each value, multiply it by the given, 
			 * and assign that to the given, so at the end
			 * the given variable equals itself times all the
			 * integers below it
			 */
			}
		return a;
		}
	}
	public static boolean isPrime(int a) {
		boolean answer = false;
		for(int i = a-1; i > 1; i--) {
			//count down from given value to 2
			if (isDivisibleBy(a,i)==true) {
				answer = false;
				i = 1;
				/*if given value is divisble by any of those values
				 * answer becomes false and the counter variable i becomes 1
				 * ending the loop because the test condition is no longer met 
				 */
			}
			else {	
				answer = true;
			}
		}
		return answer;	
	}
	public static int gcf(int a, int b) {
		//finds the largest factor shared by both given values
		int answer = 1;
		int largerofinputs = (int) (max(a, b));
		for (int i = largerofinputs; i > 1; i--) {
			/*starting from the larger input, count down while testing factors
			 * to see if both a and b are divisble by them
			 */
			if (isDivisibleBy(a,i)==true) {
				if (isDivisibleBy(b,i)==true) {
					answer = i;
					i = 1;
					/*once a factor is found, assign the value to answer, then
					 * set the control variable/counter to 1 to end the loop
					 *  (so that "i" doesn't satisfy the test condition anymore)
					 */
				}
				else {
				}
			}
			else {
			}
		}
		return answer;
	}
	public static double sqrt(double n) {
		//finds approximation for square root of a number to two decimal places
		if (n<0) {
			System.out.println("That's not a positive number, please give a correct input.");
			return 0;
		}
		//for negative numbers, make them positive
		else {
		}
		double answer = 1;
		double difference = absValue(n-square(answer));
		//continue until the square of the answer is within 0.05 of the given number
		while (difference > 0.005) {
			answer = 0.5*(n/answer + answer);
			//Newton's method of finding a closer approximation by guess and check
			difference = absValue(n-square(answer));
		}
		return round2(answer);
	}
}
