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
}
