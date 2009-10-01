package helloworld;

import org.jboss.aop.Aspect;
import org.jboss.aop.Bind;
import org.jboss.aop.PointcutDef;
import org.jboss.aop.joinpoint.Invocation;
import org.jboss.aop.pointcut.Pointcut;

@Aspect
public class HelloAspect {
	
	@PointcutDef("execution(public * *->setMessage(..))")
	public static Pointcut setMessage;	
	
	@PointcutDef("execution(* *->getMessage(..))")
	public static Pointcut getMessage;	
	
	@PointcutDef("execution(* *->getOne(..))")
	public static Pointcut getOne;	
	
  @Bind(pointcut="helloworld.HelloAspect.setMessage")
	public Object logSetMessage(Invocation i) throws Throwable {
		System.out.println("setMessage");
		return i.invokeNext();
	}

  @Bind(pointcut="helloworld.HelloAspect.getMessage")
	public Object logGetMessage(Invocation i) throws Throwable {
		System.out.println("getMessage");
		Object result = i.invokeNext();
		System.out.println("getMessage done");
		return result;
	}

  @Bind(pointcut="helloworld.HelloAspect.getOne")
	public Object logGetOne(Invocation i) throws Throwable {
		System.out.println("getOne");
		return i.invokeNext();
	}
}
