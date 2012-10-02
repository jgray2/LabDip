
package dip.lab3;

/**
 *
 * @author Jenni
 */
public class Startup {
    public static void main(String[] args) {
       
        MessageService message = new MessageService(new WelcomeMessageStrategy(""), 
                new guiRendererStrategy());
        
        message.sendMessage();
        
        
    }
    
}
