
package dip.lab3;

/**
 *
 * @author Jenni
 */
public class Startup {
    public static void main(String[] args) {
        
        MessageTypeStrategy message1= new WelcomeMessageStrategy("");
        RendererStrategy strategy1 = new GuiRendererStrategy();
       
        MessageService message = new MessageService(message1, strategy1);
        
        message.sendMessage();
        
        
    }
    
}
