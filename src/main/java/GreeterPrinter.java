import javax.inject.Inject;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GreeterPrinter implements Runnable {
    private final HelloGreeter helloGreeter;
    private final HelloScheduler helloScheduler;
    private final int randomID;

    @Inject
    public GreeterPrinter(HelloGreeter helloGreeter, HelloScheduler helloScheduler) {
        this.helloGreeter = helloGreeter;
        this.helloScheduler = helloScheduler;
        this.randomID = Math.abs(new Random().nextInt());
    }

    @Override
    public void run() {
        helloScheduler.scheduleAtFixedRate(this::print, 0, 2, TimeUnit.SECONDS);
    }

    public void print() {
        System.out.println(this.randomID + " " + this.helloGreeter.getRandomId());
    }
}
