import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(
                new TestingModule()
        );

        GreeterPrinter greeterPrinter =
                injector.getInstance(GreeterPrinter.class);
        Thread greeterThread = new Thread(greeterPrinter);
        greeterThread.start();

        GreeterPrinter greeterPrinter2 =
                injector.getInstance(GreeterPrinter.class);
        Thread greeterThread2 = new Thread(greeterPrinter2);
        greeterThread2.start();
    }
}
