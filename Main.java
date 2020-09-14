import java.util.Scanner;
/**
 *
 * @author Gavin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // declare a variable that will calcualte the quotient of two numbers and the remainder
    String name;
   System.out.println("Enter two numbers using X and Y to calcualte the quotient and the remainder:");
    
    // Creates a Scanner used for input
    Scanner input = new Scanner(System.in);
     int X = input.nextInt();

     // Creates a Scanner used for input
     int Y = input.nextInt();


     int Z = (X/Y);
     int P = (X%Y);
     

     // declare and calculate the quotient
   System.out.println(X + "divided by" + Y + "is equal to" + Z + "with a remainder of" + P);
   


  }
}
