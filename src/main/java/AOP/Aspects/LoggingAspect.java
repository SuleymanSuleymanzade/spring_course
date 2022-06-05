package AOP.Aspects;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
class LoggingAspect {
    @Before("execution(public void AOP.UniLibrary.getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("Before book advice");
    }
}
