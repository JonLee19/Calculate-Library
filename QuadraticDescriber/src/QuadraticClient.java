/*This class is client code that uses Quadratic library to do describe a parabola
@author Jon Lee
@version October 4, 2018 
 */
import java.util.*;
//runs quadratic class to describe quadratic equations
public class QuadraticClient {
	
	public static void main(String[] args) {
		System.out.print("Please give the coefficients of the quadratic equation. ");
		Scanner console = new Scanner(System.in);
		double a = console.nextDouble();
		double b = console.nextDouble();
		double c = console.nextDouble();
		console.close();
		System.out.println(Quadratic.quadrDescriber(a, b, c));
		
	}

}


