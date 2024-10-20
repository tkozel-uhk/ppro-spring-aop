package aop.config.annotation2;

import model.Pozdrav;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Deklarativne vytvareny advised objekt
 * s konfiguraci pomoci anotaci
 * a automatickym vytvrením proxy (AspectJ - Autoproxy).
 * Spring konfigurovan plne pres anotace a Java config (bez XML)
 * @author Pavel Kriz
 *
 */
@Configuration
@EnableAspectJAutoProxy
public class PozdravAppAnnotations2 {

	@Bean
	public Pozdrav pozdravBean() {
		return new Pozdrav();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("aop.config.annotation2");
		
		Pozdrav pozdrav = (Pozdrav) ctx.getBean("pozdravBean");
		
		System.out.println("ADVISED BEAN POMOCÍ AUTOPROXY==============");
		pozdrav.pozdrav();
		
		System.out.println("METODA BEZ UPLATNĚNÍ POINTCUTU==============");
		pozdrav.nadavej();
	}

}
