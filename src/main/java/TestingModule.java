import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import javax.inject.Singleton;

public class TestingModule extends AbstractModule {
    @Provides
    @Singleton
    HelloGreeter providesHelloGreeter() {
        return new HelloGreeter();
    }

    @Provides
    HelloScheduler providesHelloScheduler() {
        return new HelloScheduler();
    }
}
