package aop.ioc;

import model.Pozdrav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Deklarativne vytvorena proxy
 * @author Tomas Kozel
 *
 */
public class PozdravAppDI {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/ioc/beans.xml");
		
		Pozdrav pozdrav = (Pozdrav) ctx.getBean("pozdravTarget");
		
		Pozdrav pozdravProxy = (Pozdrav) ctx.getBean("pozdrav");

		System.out.println("ORIGINÁLNÍ NEZABALENÝ OBJEKT==============");
		pozdrav.pozdrav();
		System.out.println("\n\nPŘÍSTUP PŘES PROXY K ADVISED OBJEKTU======");
		pozdravProxy.pozdrav();
	}

}
