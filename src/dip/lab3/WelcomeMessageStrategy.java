package dip.lab3;

/**
 *
 * @author Jenni
 */
public class WelcomeMessageStrategy implements MessageTypeStrategy {

    String welcome = "Welcome";

    public final String createMessage() {
        // validation
        String message = welcome;
        return message;
    }

    public WelcomeMessageStrategy(String message) {
        this.createMessage();
    }
}
