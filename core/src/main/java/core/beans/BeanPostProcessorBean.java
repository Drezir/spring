package core.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 12.09.2018
 **/
public class BeanPostProcessorBean implements BeanPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(BeanPostProcessorBean.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("Process before initialization of bean {}", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("Process after initialization of bean {}", beanName);
        return bean;
    }

}
