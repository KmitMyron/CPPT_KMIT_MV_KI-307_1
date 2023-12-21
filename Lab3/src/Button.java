/**
 * Class Button
 * @author
 * @version 1.0
 */
public class Button
{
    private String action;

    /**
     * Constructor
     * @param action
     */
    public Button(String action) {
        this.action = action;
    }

    /**
     * Getter for action
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * Setter for action
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Button{ " +
                "action = '" + action + '\'' +
                '}';
    }
}