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
		System.out.println(Calculate.isDivisibleBy(9, 5));
	}

}
