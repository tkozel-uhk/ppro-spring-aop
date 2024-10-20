package aop.simple;

import model.Pozdrav;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Programove vytvareni advised objektu
 * @author Tomas Kozel
 *
 */
public class PozdravApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pozdrav pozdrav = new Pozdrav();
		
		ProxyFactory pf = new ProxyFactory();
		
		pf.setTarget(pozdrav);
		pf.addAdvice(new PozdravInterceptor());
		
		Pozdrav pozdravProxy = (Pozdrav) pf.getProxy();
		
		System.out.println("ORIGINÁLNÍ NEZABALENÝ OBJEKT==============");
		pozdrav.pozdrav();
		System.out.println("\n\nPŘÍSTUP PŘES PROXY K ADVISED OBJEKTU======");
		pozdravProxy.pozdrav();
	}

}
