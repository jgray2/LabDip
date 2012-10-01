
package dip.lab3;

/**
 *
 * @author Jenni
 */
public class errorMessageStrategy implements MessageTypeStrategy {
    String errorMessage = "Error";

    public final String createMessage() {
        String message = errorMessage;
        return message;
    }

    public errorMessageStrategy(String message) {
        this.createMessage();
    }
    
}
