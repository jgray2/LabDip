package dip.lab3;

/**
 *
 * @author Jenni
 */
public class WelcomeMessageStrategy implements MessageTypeStrategy {

    String welcome = "Welcome";

    public final String createMessage(String message) {
        // validation
        return message = welcome;
    }

    
}
