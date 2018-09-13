//This class contains methods that perform various math operations
//@author Jon Lee
//@version September 6, 2018
public class Calculate {
	//returns square of the input
	/*start a method by writing public static, 
	 * void if you don't want to return something, 
	 * and a data type if you do
	 * then lastly the name of the method 
	 * and the initialized argument and {*/
	public static int square(int number) {
			return number*number;
	}
	public static double square(double number) {
		return number*number;
	}
	public static int cube(int number) {
			return number*number*number;
	}
	public static double average(double num1, double num2) {
		return (num1 + num2)/2;
	}
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3)/3;
	}
	public static double toDegrees(double num1) {
		return (num1)*180/3.14159;
	}
	public static double toRadians(double num1) {
		return num1*3.14159/180;
	}
	public static double discriminant(double a, double b, double c) {
		return square(b) - 4*a*c;
	}
	public static String toImproperFrac(int wholenumber, int numerator, int denominator) {
		int answer = wholenumber*denominator+numerator;
		return (answer+"/"+denominator);
	}
	public static String toMixedNum(int numerator, int denominator) {
		int wholenumber = numerator/denominator;
		if (wholenumber==0) {
			return ("That's not an improper fraction, you're answer is "+numerator+"/"+denominator);
		}
		else {
			int remainder = numerator%denominator;
			return (wholenumber+" "+remainder+"/"+denominator);
		}
	}
	public static String foil(int a, int b, int c, int d, String n) {
		int coefficient1 = a*c;
		int coefficient2 = a*d+b*c;
		int coefficient3 = b*d;
		return (coefficient1+n+"^2 + "+coefficient2+n+" + "+coefficient3);
	}
	public static boolean isDivisibleBy(int a, int b) {
		if (a%b == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static double absValue(double a) {
		if (a <= 0) {
			return -1*a;
		}
		else {
			return a;
		}
	}
	public static double max(double a, double b) {
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
		if (a<=b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static double round2 (double a) {
		int threedecimalplaces = 1000*a;
		int twodecimalplaces = 100*a;
				if (threedecimalplaces%10>=5) {
					return (twodecimalplaces/100.0)+1;
				}
				else {
					return (twodecimalplaces/100.0);
				}
	}
	
}
