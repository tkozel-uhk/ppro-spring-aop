package aop.config.annotation2;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Advice jako POJO s anotacemi
 * @author Tomas Kozel
 *
 */
@Aspect
@Component
public class AnnotatedAdvice2 {
		
	/**
	 * "Ulitba bohum". Metoda je vyuzivana jen 
	 * pro pojmenovani pointcutu
	 */
	@Pointcut("execution(* *.pozdrav(..))")
	public void napisPozdrav() {}

	@Before("napisPozdrav()")
	public void vypisUvod() {
		System.out.println("Dobrý den,\n");
	}

	@After("napisPozdrav()")
	public void vypisZaver() {
		System.out.println("\nS pozdravem\nTomáš Kozel");
	}

}
