package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 23.09.2018
 **/
@Aspect
public class AopClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(AopClass.class);

    public void printSomething() {
        LOGGER.info("(After returning) - Method finished");
    }

    public void logAroundAllMethods(ProceedingJoinPoint pjp) throws Throwable
    {
        LOGGER.info("(Around) - Before method call");
        pjp.proceed();
        LOGGER.info("(Around) - After method call");
    }

    @Before("execution(* aop.SomeClass.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        LOGGER.warn("(Before) - execution: " + Arrays.toString(joinPoint.getArgs()));
    }
}
