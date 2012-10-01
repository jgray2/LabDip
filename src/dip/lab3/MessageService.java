
package dip.lab3;

/**
 *
 * @author Jenni
 */
public class MessageService {
    private MessageTypeStrategy message;
    private RendererStrategy renderer;

    public MessageService(MessageTypeStrategy message, RendererStrategy renderer) {
        this.message = message;
        this.renderer = renderer;
    }
    
    public void sendMessage() {
        String messageOut = message.createMessage();
        renderer.outputData(messageOut);
        
    }
    
}
