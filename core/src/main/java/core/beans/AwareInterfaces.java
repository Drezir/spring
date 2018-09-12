package core.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 12.09.2018
 **/
public class AwareInterfaces implements ApplicationContextAware { // more aware interfaces

    private static final Logger LOGGER = LoggerFactory.getLogger(AwareInterfaces.class);

    @Autowired
    public void setApplicationContextThroughAnnotation(ApplicationContext applicationContext) {
        LOGGER.info("I have received application context through annotation {}", applicationContext.getDisplayName());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOGGER.info("I have received application context through interface {}", applicationContext.getDisplayName());
    }
}
