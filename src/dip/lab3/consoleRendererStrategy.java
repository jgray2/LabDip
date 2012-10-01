
package dip.lab3;

/**
 *
 * @author Jenni
 */
public class consoleRendererStrategy implements RendererStrategy {

    public final void outputData(String output) {
        System.out.println(output);
    }

    public consoleRendererStrategy(String output) {
        this.outputData(output);
    }
    
}
