package aop.config.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Advice jako POJO s anotacemi
 * @author Tomas Kozel
 *
 */
@Aspect
public class AnnotatedAdvice {
		
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
