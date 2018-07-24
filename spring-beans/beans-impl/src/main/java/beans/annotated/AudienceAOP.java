package beans.annotated;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Calendar;

@Aspect
public class AudienceAOP {
    @Around("execution(* beans.api.Performer.perform(..))")
    public void performanceAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("The audience is taking their seats");
        System.out.println("The audience is turning off their cellphones");
        long millisStart = System.currentTimeMillis();
        joinPoint.proceed();
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
        System.out.println("Boo! We want our money back");
        long millisEnd = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millisEnd - millisStart);
        System.out.println("Performance took exactly " + calendar.toString());
    }
}
