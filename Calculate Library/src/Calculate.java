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
	public static double toDegrees(double angle_radians) {
		//returns angle measure in radians to units of degrees
		return (angle_radians)*180/3.14159;
	}
	public static double toRadians(double angle_degrees) {
		//converts degree value to units of radians
		return angle_degrees*3.14159/180;
	}
	public static double discriminant(double a, double b, double c) {
		//calculates the discriminant, which is used to determine how many
		//real roots a quadratic equation has
		return (square(b) - 4*a*c);
	}
	public static String toImproperFrac(int wholenumber, int numerator, int denominator) {
		//converts mixed number to improper fraction using math rules
		if (denominator == 0) {
			throw new IllegalArgumentException("The denominator is 0, please give the right input.");
		}
		int answer = wholenumber*denominator+numerator;
		return (answer+"/"+denominator);
	}
	public static String toMixedNum(int numerator, int denominator) {
		//converts an improper fraction to mixed number using math rules
		if (denominator == 0) {
			throw new IllegalArgumentException("The denominator is 0, please give the right input.");
		}
		int wholenumber = numerator/denominator;
		//whole number is the result of division where the remainder is ignored
		if (wholenumber==0) {
			return ("That's not an improper fraction, your answer is "+numerator+"/"+denominator);
			//if the numerator is not greater than the denominator, returns error above
		}
		else {
			int remainder = numerator%denominator;
			//remainder uses mod (%) which gives only the remainder when dividing
			return (wholenumber+"_"+remainder+"/"+denominator);
		}
	}
	public static String foil(int a, int b, int c, int d, String variable) {
		//does foil operations, inner times inner and outer times outer, etc
		//returns the coefficients in standard form of quadratic equations
		int coefficient1 = a*c;
		int coefficient2 = a*d+b*c;
		int coefficient3 = b*d;
		return (coefficient1+variable+"^2 + "+coefficient2+variable+" + "+coefficient3);
	}
	public static boolean isDivisibleBy(int dividend, int divisor) {
		//if dividend divided by divisor has no remainder, it is divisible 
		//so returns true, if not, returns false
		if (divisor == 0) {
			throw new IllegalArgumentException("The given divisor is 0, please give the right input.");
			//return error message if incorrect input is given
		}
		else {
			if (dividend%divisor == 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static double absValue(double number) {
		//if number is negative, returns the opposite; 
		//if number is positive, returns number
		//either result is the positive value of number
		if (number <= 0) {
			return -1*number;
		}
		else {
			return number;
		}
	}
	public static double max(double num1, double num2) {
		//returns num1 if num1 is greater than num2, or num2 if num2 is greater
		if (num1 > num2) {
			return num1;
		}
		else if (num1 < num2) {
			return num2;
		}
		else {
			return num1;
		}
	}
	public static double max(double num1, double num2, double num3) {
		//returns num1 if num1 is greater than num2 and num3, same for num2 or num3
		if (num1>=num2 && num1>=num3) {
			return num1;
		}
		else if (num2>=num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
	public static int min(int num1, int num2) {
		//returns num1 if num1 is less or equal to num2, or num2 if num2 is less
		if (num1<=num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	public static double min(double num1, double num2) {
		//returns num1 if num1 is less or equal to num2, or num2 if num2 is less
		if (num1<=num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	public static double round2 (double decimal) {
		int threedecimalplaces = (int) (1000*decimal);
		/*multiply the given by a thousand, then convert it to an int
		 *  so that the digits after the decimal point are truncated
		 * then divide by ten to see if the last digit is 
		 * greater than or equal to five, and if so round up, if not round down
		 * last, divide by a hundred using doubles division to return 
		 * the decimal place to its original spot 
		 */
		if (decimal >= 0) {
				if (threedecimalplaces%10>=5) {
					return (((threedecimalplaces/10)+1)/100.0);
				}
				else {
					return (threedecimalplaces/1000.0);
				}
		}
		else {
			if (threedecimalplaces%10<=-5) {
				//the % of a negative number is negative
				return (((threedecimalplaces/10)-1)/100.0);
			}
			else {
				return (threedecimalplaces/1000.0);
			}
		}
		//if decimal is negative, the decimal should round up the digit 
		//in question if the next digit is greater than five, resulting in a more negative number
	}
	public static double exponent(double base, int power) {
		if (power <= 0) {
			throw new IllegalArgumentException("That's not a positive integer, please give the right input.");
			//return error message and throws exception if incorrect input is given
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
	public static int factorial(int integer) {
		if (integer <= 0) {
			throw new IllegalArgumentException("That's not a positive integer, please give the right input.");
			//return error message if incorrect input is given
		}
		else {
			for (int i = integer-1; i > 0; i--) {
			//count down from given value to 1
			integer = integer*i;
				integer = integer*i;
			/*for each value, multiply it by the given, 
			 * and assign that to the given, so at the end
			 * the given variable equals itself times all the
			 * integers below it
			 */
		}
		return integer;
			}
	}
	public static boolean isPrime(int integer) {
		boolean answer = false;
		if (integer <= 1) {
			throw new IllegalArgumentException("That's not a valid input, please give a positive integer greater than 1");
		}
		for(int i = integer-1; i > 1; i--) {
			//count down from given value to 2
			if (isDivisibleBy(integer,i)==true) {
				answer = false;
				i = 1;
				/*if given value is divisible by any of those values
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
	public static int gcf(int num1, int num2) {
		//finds the largest factor shared by both given values
		int answer = 1;
		for (int i = (int) absValue(num1); i > 1; i--) {
			/*starting from the 1st input (either works), count down while testing factors
			 * to see if both num1 and num2 are divisible by them
			 */
			if (isDivisibleBy(num1,i)==true && isDivisibleBy(num2,i)==true) {
					answer = i;
					i = 1;
					/*once a factor is found, assign the value to answer, then
					 * set the control variable/counter to 1 to end the loop
					 *  (so that "i" doesn't satisfy the test condition anymore)
					 */
			}
		}
		return answer;
	}
	public static double sqrt(double number) {
		//finds approximation for square root of a number to two decimal places
		if (number<0) {
			throw new IllegalArgumentException("That's not a positive number, please give a correct input.");
			//end program by throwing exception if number is not positive
		}
		//for negative numbers, throw exception
		double answer = 1;
		double difference = absValue(number-square(answer));
		//continue until the square of the answer is within 0.05 of the given number
		while (difference > 0.005) {
			answer = 0.5*(number/answer + answer);
			//Newton's method of finding a closer approximation by guess and check
			//use repeatedly until approximation is within 0.005 of the answer
			difference = absValue(number-square(answer));
		}
		return round2(answer);
	}
	public static String quadForm(int a, int b, int c) {
		if (discriminant(a,b,c) > 0) {
			double answer1 = round2(((-b+sqrt(discriminant(a,b,c)))/(2.0*a)));
			double answer2 = round2(((-b-sqrt(discriminant(a,b,c)))/(2.0*a)));
			return (min(answer1, answer2)+" and "+max(answer1, answer2)); 
			//use derivative equation to give both answers, one is -b+...
			//the other is -b-...
		}
		else if (discriminant(a,b,c) == 0) {
			return (""+round2(((-b)/(2.0*a))));
			//change result to a string by concatenating with an empty string
		}
		else {
			return ("no real roots");
		}
	}
	public static String quadForm(double a, double b, double c) {
		if (discriminant(a,b,c) > 0) {
			double answer1 = round2(((-b+sqrt(discriminant(a,b,c)))/(2.0*a)));
			double answer2 = round2(((-b-sqrt(discriminant(a,b,c)))/(2.0*a)));
			return (min(answer1, answer2)+" and "+max(answer1, answer2)); 
			//use derivative equation to give both answers, one is -b+...
			//the other is -b-...
		}
		else if (discriminant(a,b,c) == 0) {
			return (""+round2(((-b)/(2.0*a))));
			//change result to a string by concatenating with an empty string
		}
		else {
			return ("no real roots");
		}
	}
}
