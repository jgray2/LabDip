package dip.lab2.solution;

// An useful import if you need it.
//import dip.lab2.solution.BaggageServiceTipCalculator.ServiceQuality;
import dip.lab2.solution.BaggageServiceTipCalculatorStrategy.ServiceQuality;
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
   
    public static void main(String[] args) {
       // create the two types of tip objects & then put one into the tipService
       // make sure you use polymorphism...TipCalculatorStrategy calc = new...
        
        TipService tipService = new TipService(new 
                BaggageServiceTipCalculatorStrategy(ServiceQuality.GOOD,5));
                      
        double tip = tipService.getTheTip();
        System.out.println("The tip is " + tip);
    }
}
