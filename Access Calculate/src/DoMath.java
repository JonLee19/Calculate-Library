/*This class is client code that uses Calculate library to do math operations
@author Jon Lee
@version September 6, 2018 
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(30));
		System.out.println(Calculate.cube(79));
		System.out.println(Calculate.average(8, 5));
		System.out.println(Calculate.average(7,8,10));
		System.out.println(Calculate.toDegrees(14));
		System.out.println(Calculate.toRadians(17));
		System.out.println(Calculate.discriminant(3, 4, 5));
		System.out.println(Calculate.toImproperFrac(3, 4, 5));
		System.out.println(Calculate.toMixedNum(4, 5));
		System.out.println(Calculate.isDivisibleBy(9, 3));
		System.out.println(Calculate.absValue(-5));
		System.out.println(Calculate.max(5, 90));
		System.out.println(Calculate.max(90, 90, 45));
		System.out.println(Calculate.min(90, 90));
		System.out.println(Calculate.round2(90.03725));
		System.out.println(Calculate.exponent(.4, -5));
		System.out.println(Calculate.factorial(-6));
		System.out.println(Calculate.gcf(-64, 16));
		System.out.println(Calculate.sqrt(-88.1));
	}

}
