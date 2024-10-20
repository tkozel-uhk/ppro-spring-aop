package aop.simple;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Around advice (Interceptor)
 * @author Tomas Kozel
 *
 */
public class PozdravInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Dobrý den,\n");
		//volani originalni metody ciloveho objektu
		Object ret = invocation.proceed();
		System.out.println("\nS pozdravem\nTomáš Kozel");
		return ret;
	}

}
