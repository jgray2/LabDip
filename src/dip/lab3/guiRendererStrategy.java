
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jenni
 */
public class guiRendererStrategy implements RendererStrategy {

    public final void outputData(String output) {
       JOptionPane.showMessageDialog(null,output);
    }

    
}
