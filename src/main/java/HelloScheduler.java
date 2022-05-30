import java.util.concurrent.ScheduledThreadPoolExecutor;

public class HelloScheduler extends ScheduledThreadPoolExecutor {
    private static final int CORE_POOL_SIZE = 4;

    public HelloScheduler() {
        super(CORE_POOL_SIZE);
    }
}
