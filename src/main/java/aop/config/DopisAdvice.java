package aop.config;


/**
 * POJO Advice konfigurovana pomoci <aop:config>
 * @author Tomas Kozel
 *
 */
public class DopisAdvice {

	public void vypisUvod() {
		System.out.println("Dobrý den,\n");
	}
	
	public void vypisZaver() {
		System.out.println("\nS pozdravem\nTomáš Kozel");
	}

}
