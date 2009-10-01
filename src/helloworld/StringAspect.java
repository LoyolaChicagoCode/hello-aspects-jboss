package helloworld;

import org.jboss.aop.Aspect;
import org.jboss.aop.Bind;
import org.jboss.aop.PointcutDef;
import org.jboss.aop.joinpoint.Invocation;
import org.jboss.aop.pointcut.Pointcut;

@Aspect
public class StringAspect {
	
//	@PointcutDef("execution(public * *->substring(..))")
//	@PointcutDef("all(java.lang.String)")
	@PointcutDef("call(public * *->substring(..))")
	public static Pointcut substring;	


  @Bind(pointcut="helloworld.StringAspect.substring")
	public Object logSubstring(Invocation i) throws Throwable {
		System.out.println("substring " + i);
		return i.invokeNext();
	}
}
