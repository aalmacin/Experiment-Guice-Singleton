import java.util.Random;

public class HelloGreeter {
    private final String randomId;

    public HelloGreeter() {
        randomId = "MY_ID: " + Math.abs(new Random().nextInt());
    }

    public String getRandomId() {
        return this.randomId;
    }
}
