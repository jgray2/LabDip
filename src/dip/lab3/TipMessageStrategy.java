
package dip.lab3;

/**
 *
 * @author Jenni
 */
public class TipMessageStrategy implements MessageTypeStrategy {
    String tipMessage = "The tip of the day is: ";

    public final String createMessage() {
        String message = tipMessage;
        return message;
    }

    public TipMessageStrategy(String message) {
        this.createMessage();
    }
    
}
