/*This class is client code that uses Quadratic library to do describe a parabola
@author Jon Lee
@version October 4, 2018 
 */
import java.util.*;
//runs quadratic class to describe quadratic equations
public class QuadraticClient {
	
	public static void main(String[] args) {
		boolean done=false;
		System.out.println("Welcome to Quadratic Describer, the program that will describe your quadratic equation. Let's start.");
		while (done==false) {
			System.out.print("Please give the coefficients of the quadratic equation. ");
			Scanner console = new Scanner(System.in);
			double a = console.nextDouble();
			double b = console.nextDouble();
			double c = console.nextDouble();
			//console.close();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.print("Would you like to use this program again? Type \"no\" to quit. ");
			//Scanner console2 = new Scanner(System.in);
			if (console.nextLine()=="no") {
				done=true;
			}
			//console2.close();
			
		}
	}

}


