/**
 * TODO: Add a description of the class.
 */
public class Dog {

    private int time;

    public void setDrinkTime(int time) {
        this.time = time;
    }

    public int getDrinkTime() {
        return this.time;
    }

    /**
     * The dog needs to go for a walk if it had a drink more than 4 hours ago;
     * i.e., if getDrinkTime() returns a value > 4.
     */
    public boolean needsToGo() {
        return getDrinkTime() > 4;
    }
}