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
		Scanner console = new Scanner(System.in);
		//open scanners
		while (done==false) {
			System.out.print("Please give the coefficients of the quadratic equation. ");
			double a = console.nextDouble();
			double b = console.nextDouble();
			double c = console.nextDouble();
			//take the next three doubles as coefficients for the quadratic equation
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			//call quadrDescriber to explain features of the graph
			System.out.print("Would you like to use this program again? Type \"quit\" to exit. ");
			String answer = console.next();
			if (answer.equals("quit")) {
				done=true;
			}
			else {
				done=false;
			}
			//check if user wants to repeat the program
		}
		console.close();
		System.out.println("Thanks for using this program!");
	}

}


