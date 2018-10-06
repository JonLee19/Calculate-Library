/*This class contains methods used to describe a parabola
@author Jon Lee
@version October 4, 2018 
 */
public class Quadratic {
	public static String quadForm(int a, int b, int c) {
		if (discriminant(a,b,c) > 0) {
			double answer1 = round2(((-b+sqrt(discriminant(a,b,c)))/(2.0*a)));
			double answer2 = round2(((-b-sqrt(discriminant(a,b,c)))/(2.0*a)));
			return (min(answer1, answer2)+" and "+max(answer1, answer2)); 
		}
		else if (discriminant(a,b,c) == 0) {
			return (""+round2(((-b)/(2.0*a))));
			///how to change to string, is use an empty string to concatenate
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
		}
		else if (discriminant(a,b,c) == 0) {
			return (""+round2(((-b)/(2.0*a))));
			///how to change to string, is use an empty string to concatenate
		}
		else {
			return ("no real roots");
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
	public static double discriminant(double a, double b, double c) {
		//calculates the discriminant, which is used to determine how many
		//real roots a quadratic equation has
		return (square(b) - 4*a*c);
	}
	public static double square(double number) {
		//returns the square of a number by multiplying it by itself
		return number*number;
	}
	public static double sqrt(double number) {
		//finds approximation for square root of a number to two decimal places
		if (number<0) {
			throw new IllegalArgumentException("That's not a positive number, please give a correct input.");
			//end program by throwing exception if number is not positive
		}
		//for negative numbers, return error statement
		else {
		}
		double answer = 1;
		double difference = absValue(number-square(answer));
		//continue until the square of the answer is within 0.05 of the given number
		while (difference > 0.005) {
			answer = 0.5*(number/answer + answer);
			//Newton's method of finding a closer approximation by guess and check
			difference = absValue(number-square(answer));
		}
		return round2(answer);
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
	public static double round2 (double decimal) {
		int threedecimalplaces = (int) (1000*decimal);
		int twodecimalplaces = (int) (100*decimal);
		/*multiply the given by a thousand, then convert it to an int
		 *  so that the digits after the decimal point are truncated
		 * then divide by ten to see if the last digit is 
		 * greater than or equal to five, and if so round up, if not round down
		 * last, divide by a hundred using doubles division to return 
		 * the decimal place to its original spot 
		 */
		if (decimal >= 0) {
				if (threedecimalplaces%10>=5) {
					return ((twodecimalplaces+1)/100.0);
				}
				else {
					return (twodecimalplaces/100.0);
				}
		}
		else {
			if (threedecimalplaces%10>=5) {
				return ((twodecimalplaces-1)/100.0);
			}
			else {
				return (twodecimalplaces/100.0);
			}
		}
		//if decimal is negative, the decimal should round up the digit 
		//in question if the next digit is greater than five, resulting in a more negative number
	}
	public static String quadrDescriber (double a, double b, double c) {
		if (a==0) throw new IllegalArgumentException("a cannot be 0, or the equation is not quadratic.");
		//cannot be a parabola if a is 0
		String equation = "Your equation is "+a+"x^2 + "+b+"x + "+c;
		if (b==0) {
			b=-b;
		}
		//for aesthetic purposes, because 0.0 looks better than -0.0 on vertex coordinates
		String direction = new String();
		if (a>0) {
			direction = ("The parabola opens upward. ");
		}
		else {
			direction = ("The parabola opens downward. ");
		}
		//if a is positive, the graph opens up, and if its negative the graph faces downward
		double vertex_x = (-b)/(2.0*a);
		double vertex_y = a*square(vertex_x)+b*vertex_x+c;
		String vertex = ("The coordinates of the vertex are: ("+round2(vertex_x)+", "+round2(vertex_y)+"). ");
		//use math formula -b/2a to find the vertex coordinates
		String axis_of_symmetry = ("Its axis of symmetry is x = "+round2(vertex_x)+". ");
		String x_intercepts = ("Its x-intercept(s) are: "+quadForm(a, b, c)+". ");
		//quadForm already gives the roots/intercepts of the quadratic equation in string form
		String y_intercepts = ("Its y-intercept is: (0, "+c+") .");
		//y-intercept is when x = 0, which gives y = c
		return (equation+"\n"+direction+"\n"+vertex+"\n"+axis_of_symmetry+"\n"+x_intercepts+y_intercepts);
		//return all 5 components together as a string
	}
}

