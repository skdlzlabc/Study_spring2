package com.hanwha.ex;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
// 	@Pointcut("bean(*)") //~ker로 끝나는 빈에만 적용
//	1.LogAop에서 pointcutMethond()에 어노테이션@Pointcut("execution(* com.hanwha.ex.*.*(..))") 지정
//	2.LogAop에서 getParamInfoAroundCallAdvice 어노테이션@Around(value = "pointcutMethod()") 지정
//	3.applicationCTX.xml에서 aop관련 된거 주석처리하고
//	4.applicationCTX.xml에서 <aop:aspectj-autoproxy/> 추가
	@Pointcut("execution(* com.hanwha.ex.*.*(..))") // 이 메서드가 호출 됐을때 aspect를 실행하겠다
	private void pointcutMethod() {
	}

	public LogAop() {
		super();
	}

	public Object loggerAop2(JoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println("i'm here" + signatureStr);
		return ((ProceedingJoinPoint) joinpoint).proceed();
	}
	
	@Around(value = "pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
//		System.out.println(signatureStr + " is start.");
		long st = System.currentTimeMillis();

		try {
			System.out.println("aroundAdvice() " + signatureStr +" ");
			Object obj = joinpoint.proceed();	//proceed : 타겟 메서드를 실행시킴
			System.out.println("aroundAdvice() " + signatureStr +" ");		//around가 method의 결과값을 찍어줌
			return obj;	//왜 obj : 어떤 객체가 들어  줄 몰라서
		} finally {
			long et = System.currentTimeMillis();
//			System.out.println(signatureStr + " is finished.");
//			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}
	}

	@Before(value = "pointcutMethod()")
	public void beforeAdvice(JoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println("beforeAdvice() " + signatureStr);
	}

	@After(value = "pointcutMethod()")
	public void afterAdvice(JoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println("afterAdvice() " + signatureStr);
	}

	@AfterReturning(value = "pointcutMethod()")
	public void afterReturningAdvice(JoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println("after-returning() " + signatureStr);
	}

	@AfterThrowing(value = "pointcutMethod()")
	public void afterThrowingAdvice(JoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println("after-throwing() " + signatureStr);
	}

	// @Around
	public void aroundAdvice(JoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println("aroundAdvice() " + signatureStr);
	}

	// Service를 호출하기 이전에 parameter 정보를 출력하는 advice를 생성
//	@Around(value = "pointcutMethod()")
	public void getParamInfoAroundCallAdvice(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.print("getParamInfoAroundCallAdvice()\t");
		String[] args = Arrays.copyOf(joinpoint.getArgs(), joinpoint.getArgs().length, String[].class);
		System.out.println(args[0]);
		// Service를 종료할 때 return 값이 있을 경우 객체 정보를 출력하는 advice를 생성
		System.out.println(joinpoint.proceed());
	}
}
