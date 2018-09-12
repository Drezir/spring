package core.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 12.09.2018
 **/
public class LifecycleBean implements SmartLifecycle {

    private static final Logger LOGGER = LoggerFactory.getLogger(LifecycleBean.class);

    private boolean isRunning;

    @Override
    public void start() {
        isRunning = true;
        LOGGER.info("Lifecycle bean has started");
    }

    @Override
    public void stop() {
        isRunning = false;
        LOGGER.info("Lifecycle bean has stopped");
    }

    @Override
    public boolean isRunning() {
        LOGGER.info("Lifecycle bean has been asked if it is running");
        return isRunning;
    }

    @Override
    public boolean isAutoStartup() {
        LOGGER.info("Lifecycle bean has been asked if it is autostartup");
        return true;
    }

    @Override
    public void stop(Runnable runnable) {
        LOGGER.info("Lifecycle bean has been asked to stop");
        runnable.run(); // this has to be called for asynchronous shutdown
    }

    @Override
    public int getPhase() {
        LOGGER.info("Lifecycle bean has been asked for its phase");
        return Integer.MIN_VALUE; // order of lifecycle beans startup - lower number = higher priority
    }
}
