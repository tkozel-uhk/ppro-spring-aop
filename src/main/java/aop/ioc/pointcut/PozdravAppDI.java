package aop.ioc.pointcut;

import model.Pozdrav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Deklarativně nastavená proxy s regexp pointcutem
 * @author Tomas Kozel
 *
 */
public class PozdravAppDI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/ioc/pointcut/beans.xml");
		
		Pozdrav pozdrav = (Pozdrav) ctx.getBean("pozdravTarget");
		
		Pozdrav pozdravProxy = (Pozdrav) ctx.getBean("pozdrav");

		System.out.println("ORIGINÁLNÍ NEZABALENÝ OBJEKT==============");
		pozdrav.pozdrav();
		pozdrav.nadavej();

		System.out.println("\n\nPŘÍSTUP PŘES PROXY K ADVISED OBJEKTU======");
		pozdravProxy.pozdrav();
		pozdravProxy.nadavej();
	}

}
