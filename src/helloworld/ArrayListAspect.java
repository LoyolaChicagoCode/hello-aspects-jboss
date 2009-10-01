package helloworld;

import org.jboss.aop.Aspect;
import org.jboss.aop.Bind;
import org.jboss.aop.PointcutDef;
import org.jboss.aop.joinpoint.Invocation;
import org.jboss.aop.pointcut.Pointcut;

@Aspect
public class ArrayListAspect {
	
//	@PointcutDef("execution(public * java.util.List->get(..))")
//	@PointcutDef("all(java.util.List)")
	@PointcutDef("call(public * java.util.List->get(..))")
	public static Pointcut get;	


  @Bind(pointcut="helloworld.ArrayListAspect.get")
	public Object logSubstring(Invocation i) throws Throwable {
		System.out.println("get " + i);
		return i.invokeNext();
	}
}
