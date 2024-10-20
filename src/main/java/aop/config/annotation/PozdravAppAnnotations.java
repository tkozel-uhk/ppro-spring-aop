package aop.config.annotation;

import model.Pozdrav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Deklarativne vytvareny advised objekt
 * s konfiguraci pomoci anotaci
 * a automatickym vytvrením proxy (AspectJ - Autoproxy)
 * @author Tomas Kozel
 *
 */
public class PozdravAppAnnotations {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/config/annotation/beans.xml");
		
		Pozdrav pozdrav = (Pozdrav) ctx.getBean("pozdrav");
		
		System.out.println("ADVISED BEAN POMOCÍ AUTOPROXY==============");
		pozdrav.pozdrav();
		
		System.out.println("METODA BEZ UPLATNĚNÍ POINTCUTU==============");
		pozdrav.nadavej();
	}

}
