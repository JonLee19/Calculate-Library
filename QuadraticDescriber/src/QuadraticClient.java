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
			System.out.print("Would you like to use this program again? Type \"quit\" to quit. ");
			Scanner console2 = new Scanner(System.in);
			String answer = console2.nextLine();
			System.out.println("You typed "+answer);
			if (answer.contentEquals("quit")) {
				done=true;
				System.out.println(done);
				//never thinks test is true
			}
			else {
				done=false;
			}
			System.out.println(done);
			//else {
			//	quit = true;
			//}
			//console.close();
			//console2.close();
			
		}
		System.out.println("Thanks for using this program!");
	}

}


